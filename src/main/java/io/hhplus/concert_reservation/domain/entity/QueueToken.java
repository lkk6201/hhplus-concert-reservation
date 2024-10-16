package io.hhplus.concert_reservation.domain.entity;

import io.hhplus.concert_reservation.domain.entity.common.BaseTimeEntity;
import io.hhplus.concert_reservation.domain.entity.enums.QueueTokenStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

/**
 * 대기열 토큰 엔티티 클래스
 */
@Entity
public class QueueToken extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer waitPosition;

    @Enumerated(EnumType.STRING)
    private QueueTokenStatus status;

    private LocalDateTime expiresAt;
}
