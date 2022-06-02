/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Pedidos {
    private int id;
    private String fechaPedido;
    private int Productos_idProducto;
    private int Clientes_idCliente;

    public Pedidos(String fechaPedido, int Productos_idProducto, int Clientes_idCliente) {
        this.fechaPedido = fechaPedido;
        this.Productos_idProducto = Productos_idProducto;
        this.Clientes_idCliente = Clientes_idCliente;
    }

    public Pedidos(int id, String fechaPedido, int Productos_idProducto, int Clientes_idCliente) {
        this.id = id;
        this.fechaPedido = fechaPedido;
        this.Productos_idProducto = Productos_idProducto;
        this.Clientes_idCliente = Clientes_idCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public int getProductos_idProducto() {
        return Productos_idProducto;
    }

    public void setProductos_idProducto(int Productos_idProducto) {
        this.Productos_idProducto = Productos_idProducto;
    }

    public int getClientes_idCliente() {
        return Clientes_idCliente;
    }

    public void setClientes_idCliente(int Clientes_idCliente) {
        this.Clientes_idCliente = Clientes_idCliente;
    }
}
