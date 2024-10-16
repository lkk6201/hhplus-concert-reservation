package io.hhplus.concert_reservation.domain.entity;

import io.hhplus.concert_reservation.domain.entity.common.BaseTimeEntity;
import io.hhplus.concert_reservation.domain.entity.enums.ReservationStatus;
import jakarta.persistence.*;

/**
 * 콘서트 예약 내역 엔티티 클래스
 */
@Entity
public class ConcertReservation extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private Long seatId;

    @Enumerated(EnumType.STRING)
    private ReservationStatus status;
}
