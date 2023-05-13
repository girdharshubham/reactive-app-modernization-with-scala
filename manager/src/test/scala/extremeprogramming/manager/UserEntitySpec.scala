package extremeprogramming.manager

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class UserEntitySpec
    extends AnyWordSpec
    with Matchers {

  "UserEntity" must {

    "have example test that can be removed" in {
      val _ = UserEntityTestKit(new UserEntity(_))
      pending
      // use the testkit to execute a command
      // and verify final updated state:
      // val result = service.someOperation(SomeRequest)
      // verify the reply
      // val reply = result.getReply()
      // reply shouldBe expectedReply
      // verify the final state after the command
      // service.currentState() shouldBe expectedState
    }

    "handle command Register" in {
      val _ = UserEntityTestKit(new UserEntity(_))
      pending
      // val result = service.register(extremeprogramming.manager.api.User(...))
    }

    "handle command Login" in {
      val _ = UserEntityTestKit(new UserEntity(_))
      pending
      // val result = service.login(extremeprogramming.manager.api.LoginRequest(...))
    }

    "handle command Logout" in {
      val _ = UserEntityTestKit(new UserEntity(_))
      pending
      // val result = service.logout(extremeprogramming.manager.api.LogoutRequest(...))
    }

  }
}
