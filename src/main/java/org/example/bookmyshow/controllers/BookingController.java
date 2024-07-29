package org.example.bookmyshow.controllers;

import org.example.bookmyshow.dtos.BookMovieRequestDto;
import org.example.bookmyshow.dtos.BookMovieResponseDto;
import org.example.bookmyshow.dtos.ResponseStatus;
import org.example.bookmyshow.exceptions.ShowNotFoundException;
import org.example.bookmyshow.exceptions.UserNotFoundException;
import org.example.bookmyshow.models.Booking;
import org.example.bookmyshow.models.BookingStatus;
import org.example.bookmyshow.services.BookingService;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {

    public BookingService bookingService;

    public BookingController(BookingService bookingService){
        this.bookingService = bookingService;
    }

    public BookMovieResponseDto bookingMovie(BookMovieRequestDto bookMovieRequestDto) {
        BookMovieResponseDto responseDto = new BookMovieResponseDto();
        try
        {
            Booking booking = bookingService.bookMovie(
                    bookMovieRequestDto.getUserId(),
                    bookMovieRequestDto.getShowId(),
                    bookMovieRequestDto.getShowSeatIds()
            );

            responseDto.setBooking(booking);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        }catch (Exception ex){
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }

}
