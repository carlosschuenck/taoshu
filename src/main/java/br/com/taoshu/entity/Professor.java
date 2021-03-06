package br.com.taoshu.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

/**
 * Created by Carlos Schuenck on 23/04/2018.
 */


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SequenceGenerator(name = "sequence_professor", sequenceName = "sequence_professor", allocationSize = 1)
public class Professor {

    @Id
    @GeneratedValue(generator = "sequence_professor", strategy = GenerationType.AUTO)
    @Column(name = "professor_id")
    private Long id;

    @Column(nullable = false)
    @NotBlank
    private String nomeCompleto;

    @Column
    private String nomePai;

    @Column(nullable = false)
    @NotBlank
    private String nomeMae;

    @Column(nullable = false)
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataNascimento;

}
