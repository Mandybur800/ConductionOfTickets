package ua.com.conductor.dao;

import java.time.LocalDate;
import java.util.List;
import ua.com.conductor.model.MovieSession;

public interface MovieSessionDao extends GenericDao<MovieSession, Long> {
    List<MovieSession> findAvailableSessions(Long movieId, LocalDate date);
}
