create index IX_52476B9 on suiluppo_application (course_id);

create index IX_455DEA5A on suiluppo_equip_allocation (course_id);
create index IX_31D1DBF3 on suiluppo_equip_allocation (equip_id);

create index IX_32BCE9C5 on suiluppo_room_allocation (course_id);
create index IX_C5EB6D4 on suiluppo_room_allocation (roomID);