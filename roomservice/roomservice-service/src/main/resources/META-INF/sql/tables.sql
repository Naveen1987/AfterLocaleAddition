create table bookedequipment (
	booked_equip_id LONG not null primary key,
	equip_id LONG,
	course_id LONG,
	equip_quantity INTEGER,
	booked_equip_status BOOLEAN,
	booked_equip_date VARCHAR(75) null
);

create table equipment (
	equip_id LONG not null primary key,
	equipment_name VARCHAR(75) null,
	equip_quantity INTEGER,
	equip_description VARCHAR(75) null,
	equip_status BOOLEAN
);