package org.example.bookmyshow.controllers;

import org.example.bookmyshow.dtos.BookMovieRequestDto;
import org.example.bookmyshow.dtos.BookMovieResponseDto;
import org.example.bookmyshow.services.BookingService;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {

    public BookingService bookingService;

    public BookingController(BookingService bookingService){
        this.bookingService = bookingService;
    }

    public BookMovieResponseDto bookingMovie(BookMovieRequestDto bookMovieRequestDto) {
        bookingService.bookMovie(
                bookMovieRequestDto.getUserId(),
                bookMovieRequestDto.getShowId(),
                bookMovieRequestDto.getShowSeatIds()
        );

        return null;
    }

}
