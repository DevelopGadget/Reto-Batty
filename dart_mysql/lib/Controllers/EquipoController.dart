import 'package:aqueduct/aqueduct.dart';
import 'package:dart_mysql/Models/Equipo.dart';
import 'package:dart_mysql/dart_mysql.dart';

class EquipoController extends ResourceController {
  EquipoController(this.context);

  final ManagedContext context;

  @Operation.get()
  Future<Response> getAll() async {
    final equiposQuery = Query<Equipo>(context);
    final equipos = await equiposQuery.fetch();
    return Response.ok(equipos);
  }

  @Operation.get('id')
  Future<Response> getById(@Bind.path('id') int id) async {
    final equipoQuery = Query<Equipo>(context)..where((h) => h.id).equalTo(id);
    final equipo = await equipoQuery.fetchOne();
    if (equipo == null) {
      return Response.notFound();
    }
    return Response.ok(equipo);
  }

  @Operation.post()
  Future<Response> post(@Bind.body() Equipo data) async {
    final query = Query<Equipo>(context)..values = data;
    final insert = await query.insert();
    return Response.ok(insert);
  }

  @Operation.put('id')
  Future<Response> put(
      @Bind.path('id') int id, @Bind.body() Equipo data) async {
    final query = Query<Equipo>(context)
      ..where((u) => u.id).equalTo(id)
      ..values = data;
    final insert = await query.updateOne();
    return Response.ok(insert);
  }

  @Operation.delete('id')
  Future<Response> delete(@Bind.path('id') int id) async {
    final query = Query<Equipo>(context)..where((u) => u.id).equalTo(id);
    final delete = await query.delete();
    return Response.ok(delete);
  }
}
