package com.rapido.booking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rapido.booking.request.BookingRequest;

@Controller
public class BookingController {
	
	@GetMapping("viewBooking")
	public String displayBookingPage() {
		System.out.println("BookingController.displayBookingPage()");
		return "booking";
	}
	
	@PostMapping("bookMyRide")
	public String bookride(@ModelAttribute BookingRequest br ) {
		System.out.println("BookingController.bookride()");
		
		String source = br.getSource();
		String dest = br.getDestination();
		String type = br.getType();
		
		System.out.println("Request recived from  : " + source + " To : " + "Type " + type);
		
		return "bookingConfirmationPage";
	}

}
