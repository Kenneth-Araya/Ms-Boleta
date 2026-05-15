package cl.duoc.sistemaMarket.dto;
import cl.duoc.sistemaMarket.model.Boleta;

public class BoletaDTOMapper {
    
    public static BoletaDTO toDTO(Boleta boleta){
        if (boleta == null) {
            return null;
        }

        BoletaDTO boletaDTO = new BoletaDTO();
        boletaDTO.setFolio(boleta.getFolio());
        boletaDTO.setGlosa(boleta.getGlosa());
        boletaDTO.setTipo(boleta.getTipo());
        boletaDTO.setFecha(boleta.getFechaEmision());
        boletaDTO.setMontoBruto(boleta.getMontoBruto());
        boletaDTO.setMontoNeto(boleta.getMontoNeto());
        return boletaDTO;
    }

    public static Boleta toModel(BoletaDTO boletaDTO){
        if (boletaDTO == null) {
            return null;
        }


        Boleta boleta = new Boleta();
        boleta.setFolio(boletaDTO.getFolio());
        boleta.setGlosa(boletaDTO.getGlosa());
        boleta.setTipo(boletaDTO.getTipo());
        boleta.setFechaEmision(boletaDTO.getFecha());
        boleta.setMontoBruto(boletaDTO.getMontoBruto());
        boleta.setMontoNeto(boletaDTO.getMontoNeto());
        boleta.setEstado("PENDIENTE");
        return boleta;
    }
}
