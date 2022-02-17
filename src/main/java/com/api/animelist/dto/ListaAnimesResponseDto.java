package com.api.animelist.dto;

import com.api.animelist.models.ListaAnimesModel;

import javax.validation.constraints.NotBlank;

public class ListaAnimesResponseDto {

    private float nota;
    @NotBlank
    private String status;
    @NotBlank
    private String nome;
    @NotBlank
    private String autor;

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public static ListaAnimesResponseDto build(ListaAnimesModel model){
        ListaAnimesResponseDto responseDto = new ListaAnimesResponseDto();
        responseDto.setNome(model.getAnimeModel().getNome());
        responseDto.setAutor(model.getAnimeModel().getAutor());
        responseDto.setNota(model.getNota());
        responseDto.setStatus(model.getStatus());
        return responseDto;
    }
}

