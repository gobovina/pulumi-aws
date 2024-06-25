# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['UserArgs', 'User']

@pulumi.input_type
class UserArgs:
    def __init__(__self__, *,
                 display_name: pulumi.Input[str],
                 identity_store_id: pulumi.Input[str],
                 user_name: pulumi.Input[str],
                 addresses: Optional[pulumi.Input['UserAddressesArgs']] = None,
                 emails: Optional[pulumi.Input['UserEmailsArgs']] = None,
                 locale: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input['UserNameArgs']] = None,
                 nickname: Optional[pulumi.Input[str]] = None,
                 phone_numbers: Optional[pulumi.Input['UserPhoneNumbersArgs']] = None,
                 preferred_language: Optional[pulumi.Input[str]] = None,
                 profile_url: Optional[pulumi.Input[str]] = None,
                 timezone: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 user_type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a User resource.
        :param pulumi.Input[str] display_name: The name that is typically displayed when the user is referenced.
        :param pulumi.Input[str] identity_store_id: The globally unique identifier for the identity store that this user is in.
        :param pulumi.Input[str] user_name: A unique string used to identify the user. This value can consist of letters, accented characters, symbols, numbers, and punctuation. This value is specified at the time the user is created and stored as an attribute of the user object in the identity store. The limit is 128 characters.
               
               The following arguments are optional:
        :param pulumi.Input['UserAddressesArgs'] addresses: Details about the user's address. At most 1 address is allowed. Detailed below.
        :param pulumi.Input['UserEmailsArgs'] emails: Details about the user's email. At most 1 email is allowed. Detailed below.
        :param pulumi.Input[str] locale: The user's geographical region or location.
        :param pulumi.Input['UserNameArgs'] name: Details about the user's full name. Detailed below.
        :param pulumi.Input[str] nickname: An alternate name for the user.
        :param pulumi.Input['UserPhoneNumbersArgs'] phone_numbers: Details about the user's phone number. At most 1 phone number is allowed. Detailed below.
        :param pulumi.Input[str] preferred_language: The preferred language of the user.
        :param pulumi.Input[str] profile_url: An URL that may be associated with the user.
        :param pulumi.Input[str] timezone: The user's time zone.
        :param pulumi.Input[str] title: The user's title.
        :param pulumi.Input[str] user_type: The user type.
        """
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "identity_store_id", identity_store_id)
        pulumi.set(__self__, "user_name", user_name)
        if addresses is not None:
            pulumi.set(__self__, "addresses", addresses)
        if emails is not None:
            pulumi.set(__self__, "emails", emails)
        if locale is not None:
            pulumi.set(__self__, "locale", locale)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if nickname is not None:
            pulumi.set(__self__, "nickname", nickname)
        if phone_numbers is not None:
            pulumi.set(__self__, "phone_numbers", phone_numbers)
        if preferred_language is not None:
            pulumi.set(__self__, "preferred_language", preferred_language)
        if profile_url is not None:
            pulumi.set(__self__, "profile_url", profile_url)
        if timezone is not None:
            pulumi.set(__self__, "timezone", timezone)
        if title is not None:
            pulumi.set(__self__, "title", title)
        if user_type is not None:
            pulumi.set(__self__, "user_type", user_type)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Input[str]:
        """
        The name that is typically displayed when the user is referenced.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="identityStoreId")
    def identity_store_id(self) -> pulumi.Input[str]:
        """
        The globally unique identifier for the identity store that this user is in.
        """
        return pulumi.get(self, "identity_store_id")

    @identity_store_id.setter
    def identity_store_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "identity_store_id", value)

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> pulumi.Input[str]:
        """
        A unique string used to identify the user. This value can consist of letters, accented characters, symbols, numbers, and punctuation. This value is specified at the time the user is created and stored as an attribute of the user object in the identity store. The limit is 128 characters.

        The following arguments are optional:
        """
        return pulumi.get(self, "user_name")

    @user_name.setter
    def user_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_name", value)

    @property
    @pulumi.getter
    def addresses(self) -> Optional[pulumi.Input['UserAddressesArgs']]:
        """
        Details about the user's address. At most 1 address is allowed. Detailed below.
        """
        return pulumi.get(self, "addresses")

    @addresses.setter
    def addresses(self, value: Optional[pulumi.Input['UserAddressesArgs']]):
        pulumi.set(self, "addresses", value)

    @property
    @pulumi.getter
    def emails(self) -> Optional[pulumi.Input['UserEmailsArgs']]:
        """
        Details about the user's email. At most 1 email is allowed. Detailed below.
        """
        return pulumi.get(self, "emails")

    @emails.setter
    def emails(self, value: Optional[pulumi.Input['UserEmailsArgs']]):
        pulumi.set(self, "emails", value)

    @property
    @pulumi.getter
    def locale(self) -> Optional[pulumi.Input[str]]:
        """
        The user's geographical region or location.
        """
        return pulumi.get(self, "locale")

    @locale.setter
    def locale(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "locale", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input['UserNameArgs']]:
        """
        Details about the user's full name. Detailed below.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input['UserNameArgs']]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def nickname(self) -> Optional[pulumi.Input[str]]:
        """
        An alternate name for the user.
        """
        return pulumi.get(self, "nickname")

    @nickname.setter
    def nickname(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "nickname", value)

    @property
    @pulumi.getter(name="phoneNumbers")
    def phone_numbers(self) -> Optional[pulumi.Input['UserPhoneNumbersArgs']]:
        """
        Details about the user's phone number. At most 1 phone number is allowed. Detailed below.
        """
        return pulumi.get(self, "phone_numbers")

    @phone_numbers.setter
    def phone_numbers(self, value: Optional[pulumi.Input['UserPhoneNumbersArgs']]):
        pulumi.set(self, "phone_numbers", value)

    @property
    @pulumi.getter(name="preferredLanguage")
    def preferred_language(self) -> Optional[pulumi.Input[str]]:
        """
        The preferred language of the user.
        """
        return pulumi.get(self, "preferred_language")

    @preferred_language.setter
    def preferred_language(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "preferred_language", value)

    @property
    @pulumi.getter(name="profileUrl")
    def profile_url(self) -> Optional[pulumi.Input[str]]:
        """
        An URL that may be associated with the user.
        """
        return pulumi.get(self, "profile_url")

    @profile_url.setter
    def profile_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "profile_url", value)

    @property
    @pulumi.getter
    def timezone(self) -> Optional[pulumi.Input[str]]:
        """
        The user's time zone.
        """
        return pulumi.get(self, "timezone")

    @timezone.setter
    def timezone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timezone", value)

    @property
    @pulumi.getter
    def title(self) -> Optional[pulumi.Input[str]]:
        """
        The user's title.
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter(name="userType")
    def user_type(self) -> Optional[pulumi.Input[str]]:
        """
        The user type.
        """
        return pulumi.get(self, "user_type")

    @user_type.setter
    def user_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_type", value)


@pulumi.input_type
class _UserState:
    def __init__(__self__, *,
                 addresses: Optional[pulumi.Input['UserAddressesArgs']] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 emails: Optional[pulumi.Input['UserEmailsArgs']] = None,
                 external_ids: Optional[pulumi.Input[Sequence[pulumi.Input['UserExternalIdArgs']]]] = None,
                 identity_store_id: Optional[pulumi.Input[str]] = None,
                 locale: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input['UserNameArgs']] = None,
                 nickname: Optional[pulumi.Input[str]] = None,
                 phone_numbers: Optional[pulumi.Input['UserPhoneNumbersArgs']] = None,
                 preferred_language: Optional[pulumi.Input[str]] = None,
                 profile_url: Optional[pulumi.Input[str]] = None,
                 timezone: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 user_name: Optional[pulumi.Input[str]] = None,
                 user_type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering User resources.
        :param pulumi.Input['UserAddressesArgs'] addresses: Details about the user's address. At most 1 address is allowed. Detailed below.
        :param pulumi.Input[str] display_name: The name that is typically displayed when the user is referenced.
        :param pulumi.Input['UserEmailsArgs'] emails: Details about the user's email. At most 1 email is allowed. Detailed below.
        :param pulumi.Input[Sequence[pulumi.Input['UserExternalIdArgs']]] external_ids: A list of identifiers issued to this resource by an external identity provider.
        :param pulumi.Input[str] identity_store_id: The globally unique identifier for the identity store that this user is in.
        :param pulumi.Input[str] locale: The user's geographical region or location.
        :param pulumi.Input['UserNameArgs'] name: Details about the user's full name. Detailed below.
        :param pulumi.Input[str] nickname: An alternate name for the user.
        :param pulumi.Input['UserPhoneNumbersArgs'] phone_numbers: Details about the user's phone number. At most 1 phone number is allowed. Detailed below.
        :param pulumi.Input[str] preferred_language: The preferred language of the user.
        :param pulumi.Input[str] profile_url: An URL that may be associated with the user.
        :param pulumi.Input[str] timezone: The user's time zone.
        :param pulumi.Input[str] title: The user's title.
        :param pulumi.Input[str] user_id: The identifier for this user in the identity store.
        :param pulumi.Input[str] user_name: A unique string used to identify the user. This value can consist of letters, accented characters, symbols, numbers, and punctuation. This value is specified at the time the user is created and stored as an attribute of the user object in the identity store. The limit is 128 characters.
               
               The following arguments are optional:
        :param pulumi.Input[str] user_type: The user type.
        """
        if addresses is not None:
            pulumi.set(__self__, "addresses", addresses)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if emails is not None:
            pulumi.set(__self__, "emails", emails)
        if external_ids is not None:
            pulumi.set(__self__, "external_ids", external_ids)
        if identity_store_id is not None:
            pulumi.set(__self__, "identity_store_id", identity_store_id)
        if locale is not None:
            pulumi.set(__self__, "locale", locale)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if nickname is not None:
            pulumi.set(__self__, "nickname", nickname)
        if phone_numbers is not None:
            pulumi.set(__self__, "phone_numbers", phone_numbers)
        if preferred_language is not None:
            pulumi.set(__self__, "preferred_language", preferred_language)
        if profile_url is not None:
            pulumi.set(__self__, "profile_url", profile_url)
        if timezone is not None:
            pulumi.set(__self__, "timezone", timezone)
        if title is not None:
            pulumi.set(__self__, "title", title)
        if user_id is not None:
            pulumi.set(__self__, "user_id", user_id)
        if user_name is not None:
            pulumi.set(__self__, "user_name", user_name)
        if user_type is not None:
            pulumi.set(__self__, "user_type", user_type)

    @property
    @pulumi.getter
    def addresses(self) -> Optional[pulumi.Input['UserAddressesArgs']]:
        """
        Details about the user's address. At most 1 address is allowed. Detailed below.
        """
        return pulumi.get(self, "addresses")

    @addresses.setter
    def addresses(self, value: Optional[pulumi.Input['UserAddressesArgs']]):
        pulumi.set(self, "addresses", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name that is typically displayed when the user is referenced.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def emails(self) -> Optional[pulumi.Input['UserEmailsArgs']]:
        """
        Details about the user's email. At most 1 email is allowed. Detailed below.
        """
        return pulumi.get(self, "emails")

    @emails.setter
    def emails(self, value: Optional[pulumi.Input['UserEmailsArgs']]):
        pulumi.set(self, "emails", value)

    @property
    @pulumi.getter(name="externalIds")
    def external_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['UserExternalIdArgs']]]]:
        """
        A list of identifiers issued to this resource by an external identity provider.
        """
        return pulumi.get(self, "external_ids")

    @external_ids.setter
    def external_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['UserExternalIdArgs']]]]):
        pulumi.set(self, "external_ids", value)

    @property
    @pulumi.getter(name="identityStoreId")
    def identity_store_id(self) -> Optional[pulumi.Input[str]]:
        """
        The globally unique identifier for the identity store that this user is in.
        """
        return pulumi.get(self, "identity_store_id")

    @identity_store_id.setter
    def identity_store_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identity_store_id", value)

    @property
    @pulumi.getter
    def locale(self) -> Optional[pulumi.Input[str]]:
        """
        The user's geographical region or location.
        """
        return pulumi.get(self, "locale")

    @locale.setter
    def locale(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "locale", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input['UserNameArgs']]:
        """
        Details about the user's full name. Detailed below.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input['UserNameArgs']]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def nickname(self) -> Optional[pulumi.Input[str]]:
        """
        An alternate name for the user.
        """
        return pulumi.get(self, "nickname")

    @nickname.setter
    def nickname(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "nickname", value)

    @property
    @pulumi.getter(name="phoneNumbers")
    def phone_numbers(self) -> Optional[pulumi.Input['UserPhoneNumbersArgs']]:
        """
        Details about the user's phone number. At most 1 phone number is allowed. Detailed below.
        """
        return pulumi.get(self, "phone_numbers")

    @phone_numbers.setter
    def phone_numbers(self, value: Optional[pulumi.Input['UserPhoneNumbersArgs']]):
        pulumi.set(self, "phone_numbers", value)

    @property
    @pulumi.getter(name="preferredLanguage")
    def preferred_language(self) -> Optional[pulumi.Input[str]]:
        """
        The preferred language of the user.
        """
        return pulumi.get(self, "preferred_language")

    @preferred_language.setter
    def preferred_language(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "preferred_language", value)

    @property
    @pulumi.getter(name="profileUrl")
    def profile_url(self) -> Optional[pulumi.Input[str]]:
        """
        An URL that may be associated with the user.
        """
        return pulumi.get(self, "profile_url")

    @profile_url.setter
    def profile_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "profile_url", value)

    @property
    @pulumi.getter
    def timezone(self) -> Optional[pulumi.Input[str]]:
        """
        The user's time zone.
        """
        return pulumi.get(self, "timezone")

    @timezone.setter
    def timezone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timezone", value)

    @property
    @pulumi.getter
    def title(self) -> Optional[pulumi.Input[str]]:
        """
        The user's title.
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        The identifier for this user in the identity store.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> Optional[pulumi.Input[str]]:
        """
        A unique string used to identify the user. This value can consist of letters, accented characters, symbols, numbers, and punctuation. This value is specified at the time the user is created and stored as an attribute of the user object in the identity store. The limit is 128 characters.

        The following arguments are optional:
        """
        return pulumi.get(self, "user_name")

    @user_name.setter
    def user_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_name", value)

    @property
    @pulumi.getter(name="userType")
    def user_type(self) -> Optional[pulumi.Input[str]]:
        """
        The user type.
        """
        return pulumi.get(self, "user_type")

    @user_type.setter
    def user_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_type", value)


class User(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 addresses: Optional[pulumi.Input[Union['UserAddressesArgs', 'UserAddressesArgsDict']]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 emails: Optional[pulumi.Input[Union['UserEmailsArgs', 'UserEmailsArgsDict']]] = None,
                 identity_store_id: Optional[pulumi.Input[str]] = None,
                 locale: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[Union['UserNameArgs', 'UserNameArgsDict']]] = None,
                 nickname: Optional[pulumi.Input[str]] = None,
                 phone_numbers: Optional[pulumi.Input[Union['UserPhoneNumbersArgs', 'UserPhoneNumbersArgsDict']]] = None,
                 preferred_language: Optional[pulumi.Input[str]] = None,
                 profile_url: Optional[pulumi.Input[str]] = None,
                 timezone: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 user_name: Optional[pulumi.Input[str]] = None,
                 user_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource manages a User resource within an Identity Store.

        > **Note:** If you use an external identity provider or Active Directory as your identity source,
        use this resource with caution. IAM Identity Center does not support outbound synchronization,
        so your identity source does not automatically update with the changes that you make to
        users using this resource.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.identitystore.User("example",
            identity_store_id=example_aws_ssoadmin_instances["identityStoreIds"],
            display_name="John Doe",
            user_name="johndoe",
            name={
                "givenName": "John",
                "familyName": "Doe",
            },
            emails={
                "value": "john@example.com",
            })
        ```

        ## Import

        Using `pulumi import`, import an Identity Store User using the combination `identity_store_id/user_id`. For example:

        ```sh
        $ pulumi import aws:identitystore/user:User example d-9c6705e95c/065212b4-9061-703b-5876-13a517ae2a7c
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['UserAddressesArgs', 'UserAddressesArgsDict']] addresses: Details about the user's address. At most 1 address is allowed. Detailed below.
        :param pulumi.Input[str] display_name: The name that is typically displayed when the user is referenced.
        :param pulumi.Input[Union['UserEmailsArgs', 'UserEmailsArgsDict']] emails: Details about the user's email. At most 1 email is allowed. Detailed below.
        :param pulumi.Input[str] identity_store_id: The globally unique identifier for the identity store that this user is in.
        :param pulumi.Input[str] locale: The user's geographical region or location.
        :param pulumi.Input[Union['UserNameArgs', 'UserNameArgsDict']] name: Details about the user's full name. Detailed below.
        :param pulumi.Input[str] nickname: An alternate name for the user.
        :param pulumi.Input[Union['UserPhoneNumbersArgs', 'UserPhoneNumbersArgsDict']] phone_numbers: Details about the user's phone number. At most 1 phone number is allowed. Detailed below.
        :param pulumi.Input[str] preferred_language: The preferred language of the user.
        :param pulumi.Input[str] profile_url: An URL that may be associated with the user.
        :param pulumi.Input[str] timezone: The user's time zone.
        :param pulumi.Input[str] title: The user's title.
        :param pulumi.Input[str] user_name: A unique string used to identify the user. This value can consist of letters, accented characters, symbols, numbers, and punctuation. This value is specified at the time the user is created and stored as an attribute of the user object in the identity store. The limit is 128 characters.
               
               The following arguments are optional:
        :param pulumi.Input[str] user_type: The user type.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource manages a User resource within an Identity Store.

        > **Note:** If you use an external identity provider or Active Directory as your identity source,
        use this resource with caution. IAM Identity Center does not support outbound synchronization,
        so your identity source does not automatically update with the changes that you make to
        users using this resource.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.identitystore.User("example",
            identity_store_id=example_aws_ssoadmin_instances["identityStoreIds"],
            display_name="John Doe",
            user_name="johndoe",
            name={
                "givenName": "John",
                "familyName": "Doe",
            },
            emails={
                "value": "john@example.com",
            })
        ```

        ## Import

        Using `pulumi import`, import an Identity Store User using the combination `identity_store_id/user_id`. For example:

        ```sh
        $ pulumi import aws:identitystore/user:User example d-9c6705e95c/065212b4-9061-703b-5876-13a517ae2a7c
        ```

        :param str resource_name: The name of the resource.
        :param UserArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 addresses: Optional[pulumi.Input[Union['UserAddressesArgs', 'UserAddressesArgsDict']]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 emails: Optional[pulumi.Input[Union['UserEmailsArgs', 'UserEmailsArgsDict']]] = None,
                 identity_store_id: Optional[pulumi.Input[str]] = None,
                 locale: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[Union['UserNameArgs', 'UserNameArgsDict']]] = None,
                 nickname: Optional[pulumi.Input[str]] = None,
                 phone_numbers: Optional[pulumi.Input[Union['UserPhoneNumbersArgs', 'UserPhoneNumbersArgsDict']]] = None,
                 preferred_language: Optional[pulumi.Input[str]] = None,
                 profile_url: Optional[pulumi.Input[str]] = None,
                 timezone: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 user_name: Optional[pulumi.Input[str]] = None,
                 user_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserArgs.__new__(UserArgs)

            __props__.__dict__["addresses"] = addresses
            if display_name is None and not opts.urn:
                raise TypeError("Missing required property 'display_name'")
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["emails"] = emails
            if identity_store_id is None and not opts.urn:
                raise TypeError("Missing required property 'identity_store_id'")
            __props__.__dict__["identity_store_id"] = identity_store_id
            __props__.__dict__["locale"] = locale
            __props__.__dict__["name"] = name
            __props__.__dict__["nickname"] = nickname
            __props__.__dict__["phone_numbers"] = phone_numbers
            __props__.__dict__["preferred_language"] = preferred_language
            __props__.__dict__["profile_url"] = profile_url
            __props__.__dict__["timezone"] = timezone
            __props__.__dict__["title"] = title
            if user_name is None and not opts.urn:
                raise TypeError("Missing required property 'user_name'")
            __props__.__dict__["user_name"] = user_name
            __props__.__dict__["user_type"] = user_type
            __props__.__dict__["external_ids"] = None
            __props__.__dict__["user_id"] = None
        super(User, __self__).__init__(
            'aws:identitystore/user:User',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            addresses: Optional[pulumi.Input[Union['UserAddressesArgs', 'UserAddressesArgsDict']]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            emails: Optional[pulumi.Input[Union['UserEmailsArgs', 'UserEmailsArgsDict']]] = None,
            external_ids: Optional[pulumi.Input[Sequence[pulumi.Input[Union['UserExternalIdArgs', 'UserExternalIdArgsDict']]]]] = None,
            identity_store_id: Optional[pulumi.Input[str]] = None,
            locale: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[Union['UserNameArgs', 'UserNameArgsDict']]] = None,
            nickname: Optional[pulumi.Input[str]] = None,
            phone_numbers: Optional[pulumi.Input[Union['UserPhoneNumbersArgs', 'UserPhoneNumbersArgsDict']]] = None,
            preferred_language: Optional[pulumi.Input[str]] = None,
            profile_url: Optional[pulumi.Input[str]] = None,
            timezone: Optional[pulumi.Input[str]] = None,
            title: Optional[pulumi.Input[str]] = None,
            user_id: Optional[pulumi.Input[str]] = None,
            user_name: Optional[pulumi.Input[str]] = None,
            user_type: Optional[pulumi.Input[str]] = None) -> 'User':
        """
        Get an existing User resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['UserAddressesArgs', 'UserAddressesArgsDict']] addresses: Details about the user's address. At most 1 address is allowed. Detailed below.
        :param pulumi.Input[str] display_name: The name that is typically displayed when the user is referenced.
        :param pulumi.Input[Union['UserEmailsArgs', 'UserEmailsArgsDict']] emails: Details about the user's email. At most 1 email is allowed. Detailed below.
        :param pulumi.Input[Sequence[pulumi.Input[Union['UserExternalIdArgs', 'UserExternalIdArgsDict']]]] external_ids: A list of identifiers issued to this resource by an external identity provider.
        :param pulumi.Input[str] identity_store_id: The globally unique identifier for the identity store that this user is in.
        :param pulumi.Input[str] locale: The user's geographical region or location.
        :param pulumi.Input[Union['UserNameArgs', 'UserNameArgsDict']] name: Details about the user's full name. Detailed below.
        :param pulumi.Input[str] nickname: An alternate name for the user.
        :param pulumi.Input[Union['UserPhoneNumbersArgs', 'UserPhoneNumbersArgsDict']] phone_numbers: Details about the user's phone number. At most 1 phone number is allowed. Detailed below.
        :param pulumi.Input[str] preferred_language: The preferred language of the user.
        :param pulumi.Input[str] profile_url: An URL that may be associated with the user.
        :param pulumi.Input[str] timezone: The user's time zone.
        :param pulumi.Input[str] title: The user's title.
        :param pulumi.Input[str] user_id: The identifier for this user in the identity store.
        :param pulumi.Input[str] user_name: A unique string used to identify the user. This value can consist of letters, accented characters, symbols, numbers, and punctuation. This value is specified at the time the user is created and stored as an attribute of the user object in the identity store. The limit is 128 characters.
               
               The following arguments are optional:
        :param pulumi.Input[str] user_type: The user type.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserState.__new__(_UserState)

        __props__.__dict__["addresses"] = addresses
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["emails"] = emails
        __props__.__dict__["external_ids"] = external_ids
        __props__.__dict__["identity_store_id"] = identity_store_id
        __props__.__dict__["locale"] = locale
        __props__.__dict__["name"] = name
        __props__.__dict__["nickname"] = nickname
        __props__.__dict__["phone_numbers"] = phone_numbers
        __props__.__dict__["preferred_language"] = preferred_language
        __props__.__dict__["profile_url"] = profile_url
        __props__.__dict__["timezone"] = timezone
        __props__.__dict__["title"] = title
        __props__.__dict__["user_id"] = user_id
        __props__.__dict__["user_name"] = user_name
        __props__.__dict__["user_type"] = user_type
        return User(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def addresses(self) -> pulumi.Output[Optional['outputs.UserAddresses']]:
        """
        Details about the user's address. At most 1 address is allowed. Detailed below.
        """
        return pulumi.get(self, "addresses")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[str]:
        """
        The name that is typically displayed when the user is referenced.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def emails(self) -> pulumi.Output[Optional['outputs.UserEmails']]:
        """
        Details about the user's email. At most 1 email is allowed. Detailed below.
        """
        return pulumi.get(self, "emails")

    @property
    @pulumi.getter(name="externalIds")
    def external_ids(self) -> pulumi.Output[Sequence['outputs.UserExternalId']]:
        """
        A list of identifiers issued to this resource by an external identity provider.
        """
        return pulumi.get(self, "external_ids")

    @property
    @pulumi.getter(name="identityStoreId")
    def identity_store_id(self) -> pulumi.Output[str]:
        """
        The globally unique identifier for the identity store that this user is in.
        """
        return pulumi.get(self, "identity_store_id")

    @property
    @pulumi.getter
    def locale(self) -> pulumi.Output[Optional[str]]:
        """
        The user's geographical region or location.
        """
        return pulumi.get(self, "locale")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output['outputs.UserName']:
        """
        Details about the user's full name. Detailed below.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def nickname(self) -> pulumi.Output[Optional[str]]:
        """
        An alternate name for the user.
        """
        return pulumi.get(self, "nickname")

    @property
    @pulumi.getter(name="phoneNumbers")
    def phone_numbers(self) -> pulumi.Output[Optional['outputs.UserPhoneNumbers']]:
        """
        Details about the user's phone number. At most 1 phone number is allowed. Detailed below.
        """
        return pulumi.get(self, "phone_numbers")

    @property
    @pulumi.getter(name="preferredLanguage")
    def preferred_language(self) -> pulumi.Output[Optional[str]]:
        """
        The preferred language of the user.
        """
        return pulumi.get(self, "preferred_language")

    @property
    @pulumi.getter(name="profileUrl")
    def profile_url(self) -> pulumi.Output[Optional[str]]:
        """
        An URL that may be associated with the user.
        """
        return pulumi.get(self, "profile_url")

    @property
    @pulumi.getter
    def timezone(self) -> pulumi.Output[Optional[str]]:
        """
        The user's time zone.
        """
        return pulumi.get(self, "timezone")

    @property
    @pulumi.getter
    def title(self) -> pulumi.Output[Optional[str]]:
        """
        The user's title.
        """
        return pulumi.get(self, "title")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[str]:
        """
        The identifier for this user in the identity store.
        """
        return pulumi.get(self, "user_id")

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> pulumi.Output[str]:
        """
        A unique string used to identify the user. This value can consist of letters, accented characters, symbols, numbers, and punctuation. This value is specified at the time the user is created and stored as an attribute of the user object in the identity store. The limit is 128 characters.

        The following arguments are optional:
        """
        return pulumi.get(self, "user_name")

    @property
    @pulumi.getter(name="userType")
    def user_type(self) -> pulumi.Output[Optional[str]]:
        """
        The user type.
        """
        return pulumi.get(self, "user_type")

