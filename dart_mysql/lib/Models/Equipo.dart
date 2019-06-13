import 'package:aqueduct/aqueduct.dart';
import 'package:dart_mysql/dart_mysql.dart';

class Equipo extends ManagedObject<_Equipo> implements _Equipo {}

class _Equipo {
  @primaryKey
  int id;

  @Column(nullable: false, databaseType: ManagedPropertyType.string)
  String name;

  @Column(nullable: false, databaseType: ManagedPropertyType.string)
  String stadium;

  @Column(nullable: false, databaseType: ManagedPropertyType.string)
  String urlShield;

  @Column(nullable: false, databaseType: ManagedPropertyType.string)
  String urlStadium;
}
