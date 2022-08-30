/*INSERÇÃO DE DADOS NAS TABELAS*/
INSERT INTO Unidades (ds_unidade) VALUES ("Kilo");
INSERT INTO Unidades (ds_unidade) VALUES ("Unidade");
INSERT INTO Unidades (ds_unidade) VALUES ("Litro");
INSERT INTO Unidades (ds_unidade) VALUES ("Metro");
INSERT INTO Unidades (ds_unidade) VALUES ("Duzia");

INSERT INTO Produtos(ds_produto, vl_produto, qt_produto, cd_unidade) VALUES ("Carne", 30.00, 2,1);
INSERT INTO Produtos(ds_produto, vl_produto, qt_produto, cd_unidade) VALUES ("Oleo", 10.00, 1,2);
INSERT INTO Produtos(ds_produto, vl_produto, qt_produto, cd_unidade) VALUES ("Leite", 5.00, 1.5,3);
INSERT INTO Produtos(ds_produto, vl_produto, qt_produto, cd_unidade) VALUES ("Alface", 3.00, 1,2);
INSERT INTO Produtos(ds_produto, vl_produto, qt_produto, cd_unidade) VALUES ("Laranja", 8.00, 10,5);

/*CONSULTAR DADOS NAS TABELAS*/
SELECT * FROM Produtos;
SELECT * FROM Unidades;

/*ALTERAÇÃO DE DADOS NAS TABELAS*/
UPDATE Produtos SET ds_produto = "Frango" WHERE cd_produto = 1;
UPDATE Unidades SET ds_unidade = "und" WHERE cd_unidade = 2;

/*EXCLUSAO DE DADOS*/
DELETE FROM Produtos WHERE cd_produto = 1;
DELETE FROM Unidades WHERE cd_unidade = 1;