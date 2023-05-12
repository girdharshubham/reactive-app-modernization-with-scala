package auth

import auth.api.User
import auth.domain.UserState
import com.google.protobuf.empty.Empty
import kalix.scalasdk.valueentity.ValueEntity
import kalix.scalasdk.valueentity.ValueEntityContext

// This class was initially generated based on the .proto definition by Kalix tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

import UserEntity._

class UserEntity(context: ValueEntityContext) extends AbstractUserEntity {
  override def emptyState: UserState = UserState()

  override def register(
      currentState: UserState,
      user: auth.api.User
  ): ValueEntity.Effect[Empty] =
    effects.updateState(user.toDomain).thenReply(Empty())

  override def login(
      currentState: UserState,
      loginRequest: auth.api.LoginRequest
  ): ValueEntity.Effect[Empty] = effects.reply(Empty())

  override def logout(
      currentState: UserState,
      logoutRequest: auth.api.LogoutRequest
  ): ValueEntity.Effect[Empty] = effects.reply(Empty())

}

object UserEntity {
  implicit class UserStateExtensions(val user: auth.api.User) extends AnyVal {
    def toDomain: UserState = UserState(
      userName = user.userName,
      firstName = user.firstName,
      lastName = user.lastName,
      email = user.email,
      enabled = user.enabled
    )
  }
}
