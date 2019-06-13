import 'package:aqueduct/aqueduct.dart';
import 'package:dart_mysql/Models/Equipo.dart';
import 'package:dart_mysql/dart_mysql.dart';

class EquipoController extends ResourceController {
  //EquipoController(this.context);

  final ManagedContext context = null;

  @Operation.get()
  Future<Response> getAll() async {
    return Response.ok({'Hola': 'Mundo'});
  }

  @Operation.get('id')
  Future<Response> getById(@Bind.path('id') int id) async {
    return Response.ok({'Hola': 'Mundo'});
  }

  @Operation.post()
  Future<Response> post(@Bind.body() Equipo data) async {
    return Response.ok({'Hola': 'Mundo'});
  }

  @Operation.put('id')
  Future<Response> put(
      @Bind.path('id') int id, @Bind.body() Equipo data) async {
    return Response.ok({'Hola': 'Mundo'});
  }

  @Operation.delete('id')
  Future<Response> delete(@Bind.path('id') int id) async {
    return Response.ok({'Hola': 'Mundo'});
  }
}
