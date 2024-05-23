package co.lexdeses.appuniversidades.entidades;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "universidades")
@Builder
@ToString
public class Universidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uni_codigo")
    private int codigo;

    @Column(name = "uni_nit")
    private String nit;

    @Column(name = "uni_nombre")
    private String nombre;

    @Column(name = "uni_telefono")
    private String telefono;

    @Column(name = "uni_direccion")
    private String direccion;

    @Column(name = "uni_correo")
    private String correo;
}
