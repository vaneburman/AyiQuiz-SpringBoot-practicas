INSERT INTO PREGUNTA(idQ, PREGUNTA, PUNTOS) VALUES (1, '¿Cuál es el nombre de la ciudad más poblada de México?', 10);

Insert into opcion(ID_OPCION, idQ, OPCION, ES_CORRECTA, ES_SELECCIONADA) values (1, 1, 'opcion1', true, false), (2, 1, 'opcion2', false, false), (3, 1, 'opcion3', false, false), (4, 1, 'opcion4', false, false);
INSERT INTO jugador(ID_JUGADOR, NOMBRE, APELLIDO, USERNAME) VALUES (1, 'Juan', 'Perez', 'juanPerez');