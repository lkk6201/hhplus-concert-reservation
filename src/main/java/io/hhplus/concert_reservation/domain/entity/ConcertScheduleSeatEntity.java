package io.hhplus.concert_reservation.domain.entity;

import io.hhplus.concert_reservation.domain.entity.common.BaseTimeEntity;
import jakarta.persistence.*;

/**
 * 콘서트 좌석 엔티티 클래스
 */
@Entity(name = "concert_schedule_seat")
@Table(name = "concert_schedule_seat")
public class ConcertScheduleSeatEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long concertScheduleId;

    private Long seatNumber;

    private Long price;
}
