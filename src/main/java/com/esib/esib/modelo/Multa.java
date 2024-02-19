
package com.esib.esib.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import static javax.persistence.CascadeType.ALL;
import javax.persistence.Column;
import javax.persistence.Entity;
import static javax.persistence.FetchType.LAZY;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Entity
@Table(catalog = "esib", schema = "public")
@XmlRootElement
@Data
public class Multa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_multa", nullable = false)
    private Long idMulta;

    @Basic(optional = false)
    @Column(name = "valor_multa", nullable = false)
    private double valorMulta;

    @JoinColumn(name = "id_emprestimo", referencedColumnName = "id_emprestimo", nullable = false)
    @ManyToOne(optional = false, fetch = LAZY)
    private Emprestimo idEmprestimo;

    @JoinColumn(name = "id_estado", referencedColumnName = "id_estado", nullable = false)
    @ManyToOne(optional = false, fetch = LAZY)
    private Estado idEstado;
    
    @OneToMany(cascade = ALL, mappedBy = "idMulta", fetch = LAZY)
    private List<PagamentoMulta> pagamentoMultaList;

}