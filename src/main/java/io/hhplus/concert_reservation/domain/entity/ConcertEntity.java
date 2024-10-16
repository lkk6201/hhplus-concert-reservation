package io.hhplus.concert_reservation.domain.entity;

import io.hhplus.concert_reservation.domain.entity.common.BaseTimeEntity;
import jakarta.persistence.*;

/**
 * 콘서트 엔티티 클래스
 */
@Entity(name ="concert")
@Table(name = "concert")
public class ConcertEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String concertName;

    private String artistName;
}
