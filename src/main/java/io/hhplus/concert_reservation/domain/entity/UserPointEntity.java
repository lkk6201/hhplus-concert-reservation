package io.hhplus.concert_reservation.domain.entity;

import io.hhplus.concert_reservation.domain.entity.common.BaseTimeEntity;
import jakarta.persistence.*;

/**
 * 사용자 포인트 엔티티 클래스
 */
@Entity(name = "user_point")
@Table(name = "user_point")
public class UserPointEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private Long pointBalance;
}
