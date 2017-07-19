create table suiluppo_application (
	applicat_id LONG not null primary key,
	applicat_name VARCHAR(75) null,
	applicat_email VARCHAR(75) null,
	applicat_phone VARCHAR(75) null,
	course_id LONG,
	applicat_confirm VARCHAR(75) null
);

create table suiluppo_course (
	course_id LONG not null primary key,
	Docente VARCHAR(75) null,
	Evento_Progetto VARCHAR(75) null,
	Titolo VARCHAR(75) null,
	Descrizione VARCHAR(75) null,
	Figure_Professionali_Coinvolte VARCHAR(75) null,
	Data_Inizio VARCHAR(75) null,
	Data_Fine VARCHAR(75) null,
	Tot_Ore VARCHAR(75) null,
	Nr_Edizione VARCHAR(75) null,
	Sede VARCHAR(75) null,
	Abstract VARCHAR(75) null,
	Dispensa_corso VARCHAR(75) null,
	Ammessi_al_corso LONG,
	Scadenza_Iscrizioni VARCHAR(75) null,
	Visibile VARCHAR(75) null,
	Bloccato VARCHAR(75) null
);

create table suiluppo_equip_allocation (
	equip_allocat_id LONG not null primary key,
	course_id LONG,
	equip_id LONG,
	equip_allocat_quantity LONG
);

create table suiluppo_equipment (
	equip_id LONG not null primary key,
	equip_name VARCHAR(75) null,
	equip_quanity LONG,
	equip_description VARCHAR(75) null
);

create table suiluppo_room (
	roomID LONG not null primary key,
	room_name VARCHAR(75) null,
	room_description VARCHAR(75) null
);

create table suiluppo_room_allocation (
	room_allocat_id LONG not null primary key,
	roomID LONG,
	course_id LONG,
	room_allocat_date VARCHAR(75) null,
	room_allocat_startTime VARCHAR(75) null,
	room_allocat_start VARCHAR(75) null,
	room_allocat_end VARCHAR(75) null,
	room_allocat_status VARCHAR(75) null,
	room_allocat_endTime VARCHAR(75) null
);

create table suiluppo_room_allocation_archive (
	room_allocat_archive_id LONG not null primary key,
	roomID LONG,
	course_id LONG,
	room_allocat_date VARCHAR(75) null,
	room_allocat_startTime VARCHAR(75) null,
	room_allocat_start VARCHAR(75) null,
	room_allocat_end VARCHAR(75) null,
	room_allocat_status VARCHAR(75) null,
	room_allocat_endTime VARCHAR(75) null,
	room_archive_date VARCHAR(75) null
);