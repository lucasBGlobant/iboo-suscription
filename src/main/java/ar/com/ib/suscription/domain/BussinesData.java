package ar.com.ib.suscription.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.json.bind.annotation.JsonbProperty;

@Getter
@Setter
@Builder
@Schema(description = "Datos negocio")
public class BussinesData {

    @JsonbProperty("clave-unica-identificacion-tributaria")
    public Integer CUIT;

    @JsonbProperty("nombre")
    public String name;

    @JsonbProperty("direccion")
    public String address;

    @JsonbProperty("piso")
    public String floor;

    @JsonbProperty("departamento")
    public String department;

    @JsonbProperty("provincia")
    public String province;

    @JsonbProperty("ubicacion")
    public String location;

    @JsonbProperty("telefono")
    public String phone;

}
