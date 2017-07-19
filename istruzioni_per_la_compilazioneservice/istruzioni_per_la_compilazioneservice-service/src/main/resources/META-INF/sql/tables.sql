create table istruzioni_per_la_compilazione (
	Istruzioni_per_id LONG not null primary key,
	purpose VARCHAR(75) null,
	MainTitle VARCHAR(75) null,
	Tilte VARCHAR(75) null,
	SubTitle VARCHAR(75) null
);

create table istruzioni_per_la_compilazione_child (
	Ins_id LONG not null primary key,
	Instruction VARCHAR(75) null,
	Istruzioni_per_id LONG
);