import 'package:aqueduct/aqueduct.dart';
import 'package:dart_mysql/dart_mysql.dart';

class Equipo extends ManagedObject<Equipos> implements Equipos {}

class Equipos {
  @Column(
      databaseType: ManagedPropertyType.integer,
      primaryKey: true,
      autoincrement: true)
  int id;

  @Column(nullable: false, databaseType: ManagedPropertyType.string)
  String nameteam;

  @Column(nullable: false, databaseType: ManagedPropertyType.string)
  String stadium;

  @Column(nullable: false, databaseType: ManagedPropertyType.string)
  String urlshield;

  @Column(nullable: false, databaseType: ManagedPropertyType.string)
  String urlstadium;
}
