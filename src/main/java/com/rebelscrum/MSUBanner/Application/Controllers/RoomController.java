package com.rebelscrum.MSUBanner.Application.Controllers;

import com.rebelscrum.MSUBanner.Application.Entity.Room;
import com.rebelscrum.MSUBanner.Application.Services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RoomController {

    private RoomService roomService;

    @Autowired
    public void setRoomService(RoomService roomService){
        this.roomService = roomService;
    }

    @RequestMapping(value ="/room", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("room", roomService.listAllRooms());
        return "room";
    }

    @RequestMapping("room/{id}")
    public String showRoom(@PathVariable Integer id, Model model){
        model.addAttribute("room", roomService.getRoomById(id));
        return "roomshow";
    }

    @RequestMapping("room/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("room", roomService.getRoomById(id));
        return "roomform";
    }

    @RequestMapping("room/new")
    public String newBuilding(Model model){
        model.addAttribute("room", new Room());
        return "roomform";
    }


    @RequestMapping(value = "room", method = RequestMethod.POST)
    public String saveRoom(Room room){
        roomService.saveRoom(room);
        return "redirect:/room/" + room.getId();
    }


    @RequestMapping("room/delete/{id}")
    public String delete(@PathVariable Integer id){
        roomService.deleteRoom(id);
        return "redirect:/room";
    }

}
