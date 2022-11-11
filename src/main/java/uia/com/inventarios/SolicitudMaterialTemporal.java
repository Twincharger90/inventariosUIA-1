package uia.com.inventarios;

public class SolicitudMaterialTemporal extends SolicitudEntregaMaterial{

    private String lote;
    private String ubicacion;

    public SolicitudMaterialTemporal(SolicitudSalidaMaterial solicitando, String lote, String ubicacion) {
        super(solicitando);
        this.lote = lote;
        this.ubicacion = ubicacion;
    }

    public SolicitudMaterialTemporal(String lote, String ubicacion) {
        super();
        this.lote = lote;
        this.ubicacion = ubicacion;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
