package br.com.fiap.rodrigo.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "produtos")
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    public String nome;

}