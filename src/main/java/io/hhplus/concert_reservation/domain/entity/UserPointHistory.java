package io.hhplus.concert_reservation.domain.entity;

import io.hhplus.concert_reservation.domain.entity.common.BaseTimeEntity;
import io.hhplus.concert_reservation.domain.entity.enums.UserPointActionType;
import jakarta.persistence.*;

/**
 * 사용자 포인트 충전/사용 내역 엔티티 클래스
 */
@Entity
public class UserPointHistory extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long amount;

    @Enumerated(EnumType.STRING)
    private UserPointActionType actionType;
}
