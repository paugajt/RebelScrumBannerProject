package com.rebelscrum.MSUBanner.Application.Controllers;

import com.rebelscrum.MSUBanner.Application.Entity.Room;
import com.rebelscrum.MSUBanner.Application.Services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Room controller to pass info between database and
 * html pages
 */
@Controller
public class RoomController {

    /**
     * Services to be used by hibernate to correctly add
     * information to the database.
     */
    private RoomService roomService;

    /**
     * setter for roomService for mapping
     * @param roomService
     */
    @Autowired
    public void setRoomService(RoomService roomService){
        this.roomService = roomService;
    }

    /**
     * Will pull information from the webpages to update a
     * room to be stored in the database
     * @param model
     * @return
     */
    @RequestMapping(value ="/room", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("room", roomService.listAllRooms());
        return "room";
    }

    /**
     * Will pull information from the webpages to update a
     * room to be stored in the database
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("room/{id}")
    public String showRoom(@PathVariable Integer id, Model model){
        model.addAttribute("room", roomService.getRoomById(id));
        return "roomshow";
    }

    /**
     * Will pull information from the webpages to update a
     * room to be stored in the database
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("room/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("room", roomService.getRoomById(id));
        return "roomform";
    }

    /**
     * Will pull information from the webpages to update a
     * room to be stored in the database
     * @param model
     * @return
     */
    @RequestMapping("room/new")
    public String newBuilding(Model model){
        model.addAttribute("room", new Room());
        return "roomform";
    }

    /**
     * Will pull information from the webpages to update a
     * room to be stored in the database
     * @param room
     * @return
     */
    @RequestMapping(value = "room", method = RequestMethod.POST)
    public String saveRoom(Room room){
        roomService.saveRoom(room);
        return "redirect:/room/" + room.getId();
    }

    /**
     * Will pull information from the webpages to update a
     * room to be stored in the database
     * @param id
     * @return
     */
    @RequestMapping("room/delete/{id}")
    public String delete(@PathVariable Integer id){
        roomService.deleteRoom(id);
        return "redirect:/room";
    }

}
