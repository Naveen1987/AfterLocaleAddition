create table prontuario_drug (
	drug_id LONG not null primary key,
	Gruppo VARCHAR(75) null,
	SottoGruppo VARCHAR(75) null,
	Codice VARCHAR(75) null,
	Principio_Attivo VARCHAR(75) null,
	Nome_Commerciale VARCHAR(75) null
);