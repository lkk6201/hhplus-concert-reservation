package io.hhplus.concert_reservation.domain.entity;

import io.hhplus.concert_reservation.domain.entity.common.BaseTimeEntity;
import io.hhplus.concert_reservation.domain.enums.QueueTokenStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

/**
 * 대기열 토큰 엔티티 클래스
 */
@Entity(name = "queue_token")
@Table(name = "queue_token")
public class QueueTokenEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer waitPosition;

    @Enumerated(EnumType.STRING)
    private QueueTokenStatus status;

    private LocalDateTime expiresAt;
}
