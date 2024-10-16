package io.hhplus.concert_reservation.domain.entity;

import io.hhplus.concert_reservation.domain.entity.common.BaseTimeEntity;
import jakarta.persistence.*;

/**
 * 콘서트 결제 내역 엔티티 클래스
 */
@Entity(name ="concert_payment")
@Table(name = "concert_payment")
public class ConcertPaymentEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long reservationId;

    private Long amount;
}
