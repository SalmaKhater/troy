package troy.cql.ast.dml

import troy.cql.ast.{ ListLiteral, Term }
import troy.cql.ast.Identifier

object Update {
  sealed trait Assignment
  final case class SimpleSelectionAssignment(selection: SimpleSelection, term: Term) extends Assignment
  final case class TermAssignment(columnName1: Identifier, columnName2: Identifier, term: Term) extends Assignment
  final case class ListLiteralAssignment(columnName1: Identifier, listLiteral: ListLiteral, columnName2: Identifier) extends Assignment
}
