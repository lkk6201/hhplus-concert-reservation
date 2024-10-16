package io.hhplus.concert_reservation.domain.entity;

import io.hhplus.concert_reservation.domain.entity.common.BaseTimeEntity;
import jakarta.persistence.*;

import java.time.LocalDateTime;

/**
 * 콘서트 스케줄 엔티티 클래스
 */
@Entity
public class ConcertSchedule extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long concertId;

    private LocalDateTime concertDate;

    private String location;

    @Column(columnDefinition = "integer default 50")
    private Integer totalCapacity;

    @Column(columnDefinition = "integer default 50")
    private Integer remainCapacity;

    private LocalDateTime reservationStartDate;

    private LocalDateTime reservationEndDate;
}
