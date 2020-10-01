package com.bolsadeideas.springboot.web.app.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



	@Entity
	@Table(name="proyectos")
	public class Proyecto implements Serializable {
		
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column
		private Long id;
		
		@Column(nullable = false)
		private String referencia;
		@Column(nullable = false)
		private String titulo;
		@Column
		private String tipo;
		@Column
		private String zonificacion;
		@Column
		private String catastro;
		@Column
		private String cliente;
		@Column
		private String ubicacion;
		@Column
		private String comercial;
		@OneToMany(mappedBy = "proyecto")
		private List<Fase> fases;
		@Column
		private double presupuesto;
		@Column
		private boolean activo;
		
		@Column(name="create_at")
		@Temporal(TemporalType.DATE)
		private Date createAt;
		
		
		
		

		public Date getCreateAt() {
			return createAt;
		}

		public void setCreateAt(Date createAt) {
			this.createAt = createAt;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getReferencia() {
			return referencia;
		}

		public void setReferencia(String referencia) {
			this.referencia = referencia;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getZonificacion() {
			return zonificacion;
		}

		public void setZonificacion(String zonificacion) {
			this.zonificacion = zonificacion;
		}

		public String getCatastro() {
			return catastro;
		}

		public void setCatastro(String catastro) {
			this.catastro = catastro;
		}

		public String getCliente() {
			return cliente;
		}

		public void setCliente(String cliente) {
			this.cliente = cliente;
		}

		public String getUbicacion() {
			return ubicacion;
		}

		public void setUbicacion(String ubicacion) {
			this.ubicacion = ubicacion;
		}

		public String getComercial() {
			return comercial;
		}

		public void setComercial(String comercial) {
			this.comercial = comercial;
		}

		public List<Fase> getFases() {
			return fases;
		}

		public void setFases(List<Fase> fases) {
			this.fases = fases;
		}

		public double getPresupuesto() {
			return presupuesto;
		}

		public void setPresupuesto(double presupuesto) {
			this.presupuesto = presupuesto;
		}

		public boolean isActivo() {
			return activo;
		}

		public void setActivo(boolean activo) {
			this.activo = activo;
		}

		
		
			
}

