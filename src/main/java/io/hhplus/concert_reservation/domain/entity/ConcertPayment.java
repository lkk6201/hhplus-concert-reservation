package io.hhplus.concert_reservation.domain.entity;

import io.hhplus.concert_reservation.domain.entity.common.BaseTimeEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * 콘서트 결제 내역 엔티티 클래스
 */
@Entity
public class ConcertPayment extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long reservationId;

    private Long amount;
}
