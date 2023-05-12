package auth

import auth.domain.UserState
import com.google.protobuf.empty.Empty
import kalix.scalasdk.testkit.ValueEntityResult
import kalix.scalasdk.valueentity.ValueEntity
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import UserEntity._

class UserEntitySpec extends AnyWordSpec with Matchers {

  val girdharshubham = auth.api.User(
    userName = "girdharshubham",
    firstName = "Shubham",
    lastName = "Girdhar",
    email = "girdharshubham@hotmail.com"
  )

  "UserEntity" must {
    "handle command Register" in {
      val service = UserEntityTestKit(new UserEntity(_))
      service.currentState() shouldBe UserState()
      service.register(girdharshubham)
      service.currentState() shouldBe girdharshubham.toDomain
    }

  }
}
