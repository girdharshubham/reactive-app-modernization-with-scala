package manager

import extremeprogramming.manager.UserEntity._
import extremeprogramming.manager.domain.UserState
import extremeprogramming.manager.{UserEntity, UserEntityTestKit}
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class UserEntitySpec extends AnyWordSpec with Matchers {

  val girdharshubham = extremeprogramming.manager.api.User(
    userName = "girdharshubham",
    firstName = "Shubham",
    lastName = "Girdhar",
    email = "girdharshubham@hotmail.com",
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
