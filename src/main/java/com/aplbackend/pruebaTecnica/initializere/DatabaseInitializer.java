package com.aplbackend.pruebaTecnica.initializere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        Long count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM Usuario", Long.class);

        if (count == 0) {
            jdbcTemplate.execute("INSERT INTO Usuario (nombre, email, rol, estado) VALUES " +
                "('Juan Pérez', 'juan.perez@example.com', 'Administrador', 1)," +
                "('Ana Gómez', 'ana.gomez@example.com', 'Analista', 1)," +
                "('Carlos López', 'carlos.lopez@example.com', 'Administrador', 0)," +
                "('María Rodríguez', 'maria.rodriguez@example.com', 'Analista', 1)," +
                "('José Martínez', 'jose.martinez@example.com', 'Analista', 0)," +
                "('Laura Sánchez', 'laura.sanchez@example.com', 'Administrador', 1);");

            jdbcTemplate.execute("INSERT INTO Producto (nombreProducto, precio) VALUES " +
                "('Velas de cumpleaños', 5.99)," +
                "('Globos de fiesta', 3.49)," +
                "('Confeti', 1.99);");

            jdbcTemplate.execute("INSERT INTO Venta (usuarioId, fechaVenta, totalVenta) VALUES " +
                "(1, '2024-08-21', 50.00)," +
                "(2, '2024-08-20', 30.00);");

            jdbcTemplate.execute("INSERT INTO VentaProducto (ventaId, productoId, cantidad) VALUES " +
                "(1, 1, 5)," +
                "(1, 2, 3)," +
                "(2, 3, 10)," +
                "(2, 1, 2);");
        }
    }
}
