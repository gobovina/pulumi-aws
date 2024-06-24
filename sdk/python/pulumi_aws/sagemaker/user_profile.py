# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['UserProfileArgs', 'UserProfile']

@pulumi.input_type
class UserProfileArgs:
    def __init__(__self__, *,
                 domain_id: pulumi.Input[str],
                 user_profile_name: pulumi.Input[str],
                 single_sign_on_user_identifier: Optional[pulumi.Input[str]] = None,
                 single_sign_on_user_value: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 user_settings: Optional[pulumi.Input['UserProfileUserSettingsArgs']] = None):
        """
        The set of arguments for constructing a UserProfile resource.
        :param pulumi.Input[str] domain_id: The ID of the associated Domain.
        :param pulumi.Input[str] user_profile_name: The name for the User Profile.
        :param pulumi.Input[str] single_sign_on_user_identifier: A specifier for the type of value specified in `single_sign_on_user_value`. Currently, the only supported value is `UserName`. If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not SSO, this field cannot be specified.
        :param pulumi.Input[str] single_sign_on_user_value: The username of the associated AWS Single Sign-On User for this User Profile. If the Domain's AuthMode is SSO, this field is required, and must match a valid username of a user in your directory. If the Domain's AuthMode is not SSO, this field cannot be specified.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input['UserProfileUserSettingsArgs'] user_settings: The user settings. See User Settings below.
        """
        pulumi.set(__self__, "domain_id", domain_id)
        pulumi.set(__self__, "user_profile_name", user_profile_name)
        if single_sign_on_user_identifier is not None:
            pulumi.set(__self__, "single_sign_on_user_identifier", single_sign_on_user_identifier)
        if single_sign_on_user_value is not None:
            pulumi.set(__self__, "single_sign_on_user_value", single_sign_on_user_value)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if user_settings is not None:
            pulumi.set(__self__, "user_settings", user_settings)

    @property
    @pulumi.getter(name="domainId")
    def domain_id(self) -> pulumi.Input[str]:
        """
        The ID of the associated Domain.
        """
        return pulumi.get(self, "domain_id")

    @domain_id.setter
    def domain_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain_id", value)

    @property
    @pulumi.getter(name="userProfileName")
    def user_profile_name(self) -> pulumi.Input[str]:
        """
        The name for the User Profile.
        """
        return pulumi.get(self, "user_profile_name")

    @user_profile_name.setter
    def user_profile_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_profile_name", value)

    @property
    @pulumi.getter(name="singleSignOnUserIdentifier")
    def single_sign_on_user_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        A specifier for the type of value specified in `single_sign_on_user_value`. Currently, the only supported value is `UserName`. If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not SSO, this field cannot be specified.
        """
        return pulumi.get(self, "single_sign_on_user_identifier")

    @single_sign_on_user_identifier.setter
    def single_sign_on_user_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "single_sign_on_user_identifier", value)

    @property
    @pulumi.getter(name="singleSignOnUserValue")
    def single_sign_on_user_value(self) -> Optional[pulumi.Input[str]]:
        """
        The username of the associated AWS Single Sign-On User for this User Profile. If the Domain's AuthMode is SSO, this field is required, and must match a valid username of a user in your directory. If the Domain's AuthMode is not SSO, this field cannot be specified.
        """
        return pulumi.get(self, "single_sign_on_user_value")

    @single_sign_on_user_value.setter
    def single_sign_on_user_value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "single_sign_on_user_value", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="userSettings")
    def user_settings(self) -> Optional[pulumi.Input['UserProfileUserSettingsArgs']]:
        """
        The user settings. See User Settings below.
        """
        return pulumi.get(self, "user_settings")

    @user_settings.setter
    def user_settings(self, value: Optional[pulumi.Input['UserProfileUserSettingsArgs']]):
        pulumi.set(self, "user_settings", value)


@pulumi.input_type
class _UserProfileState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 domain_id: Optional[pulumi.Input[str]] = None,
                 home_efs_file_system_uid: Optional[pulumi.Input[str]] = None,
                 single_sign_on_user_identifier: Optional[pulumi.Input[str]] = None,
                 single_sign_on_user_value: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 user_profile_name: Optional[pulumi.Input[str]] = None,
                 user_settings: Optional[pulumi.Input['UserProfileUserSettingsArgs']] = None):
        """
        Input properties used for looking up and filtering UserProfile resources.
        :param pulumi.Input[str] arn: The user profile Amazon Resource Name (ARN).
        :param pulumi.Input[str] domain_id: The ID of the associated Domain.
        :param pulumi.Input[str] home_efs_file_system_uid: The ID of the user's profile in the Amazon Elastic File System (EFS) volume.
        :param pulumi.Input[str] single_sign_on_user_identifier: A specifier for the type of value specified in `single_sign_on_user_value`. Currently, the only supported value is `UserName`. If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not SSO, this field cannot be specified.
        :param pulumi.Input[str] single_sign_on_user_value: The username of the associated AWS Single Sign-On User for this User Profile. If the Domain's AuthMode is SSO, this field is required, and must match a valid username of a user in your directory. If the Domain's AuthMode is not SSO, this field cannot be specified.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] user_profile_name: The name for the User Profile.
        :param pulumi.Input['UserProfileUserSettingsArgs'] user_settings: The user settings. See User Settings below.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if domain_id is not None:
            pulumi.set(__self__, "domain_id", domain_id)
        if home_efs_file_system_uid is not None:
            pulumi.set(__self__, "home_efs_file_system_uid", home_efs_file_system_uid)
        if single_sign_on_user_identifier is not None:
            pulumi.set(__self__, "single_sign_on_user_identifier", single_sign_on_user_identifier)
        if single_sign_on_user_value is not None:
            pulumi.set(__self__, "single_sign_on_user_value", single_sign_on_user_value)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if user_profile_name is not None:
            pulumi.set(__self__, "user_profile_name", user_profile_name)
        if user_settings is not None:
            pulumi.set(__self__, "user_settings", user_settings)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The user profile Amazon Resource Name (ARN).
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="domainId")
    def domain_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the associated Domain.
        """
        return pulumi.get(self, "domain_id")

    @domain_id.setter
    def domain_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_id", value)

    @property
    @pulumi.getter(name="homeEfsFileSystemUid")
    def home_efs_file_system_uid(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the user's profile in the Amazon Elastic File System (EFS) volume.
        """
        return pulumi.get(self, "home_efs_file_system_uid")

    @home_efs_file_system_uid.setter
    def home_efs_file_system_uid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "home_efs_file_system_uid", value)

    @property
    @pulumi.getter(name="singleSignOnUserIdentifier")
    def single_sign_on_user_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        A specifier for the type of value specified in `single_sign_on_user_value`. Currently, the only supported value is `UserName`. If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not SSO, this field cannot be specified.
        """
        return pulumi.get(self, "single_sign_on_user_identifier")

    @single_sign_on_user_identifier.setter
    def single_sign_on_user_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "single_sign_on_user_identifier", value)

    @property
    @pulumi.getter(name="singleSignOnUserValue")
    def single_sign_on_user_value(self) -> Optional[pulumi.Input[str]]:
        """
        The username of the associated AWS Single Sign-On User for this User Profile. If the Domain's AuthMode is SSO, this field is required, and must match a valid username of a user in your directory. If the Domain's AuthMode is not SSO, this field cannot be specified.
        """
        return pulumi.get(self, "single_sign_on_user_value")

    @single_sign_on_user_value.setter
    def single_sign_on_user_value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "single_sign_on_user_value", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter(name="userProfileName")
    def user_profile_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for the User Profile.
        """
        return pulumi.get(self, "user_profile_name")

    @user_profile_name.setter
    def user_profile_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_profile_name", value)

    @property
    @pulumi.getter(name="userSettings")
    def user_settings(self) -> Optional[pulumi.Input['UserProfileUserSettingsArgs']]:
        """
        The user settings. See User Settings below.
        """
        return pulumi.get(self, "user_settings")

    @user_settings.setter
    def user_settings(self, value: Optional[pulumi.Input['UserProfileUserSettingsArgs']]):
        pulumi.set(self, "user_settings", value)


class UserProfile(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_id: Optional[pulumi.Input[str]] = None,
                 single_sign_on_user_identifier: Optional[pulumi.Input[str]] = None,
                 single_sign_on_user_value: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 user_profile_name: Optional[pulumi.Input[str]] = None,
                 user_settings: Optional[pulumi.Input[pulumi.InputType['UserProfileUserSettingsArgs']]] = None,
                 __props__=None):
        """
        Provides a SageMaker User Profile resource.

        ## Example Usage

        ### Basic usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.sagemaker.UserProfile("example",
            domain_id=test["id"],
            user_profile_name="example")
        ```

        ## Import

        Using `pulumi import`, import SageMaker User Profiles using the `arn`. For example:

        ```sh
        $ pulumi import aws:sagemaker/userProfile:UserProfile test_user_profile arn:aws:sagemaker:us-west-2:123456789012:user-profile/domain-id/profile-name
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain_id: The ID of the associated Domain.
        :param pulumi.Input[str] single_sign_on_user_identifier: A specifier for the type of value specified in `single_sign_on_user_value`. Currently, the only supported value is `UserName`. If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not SSO, this field cannot be specified.
        :param pulumi.Input[str] single_sign_on_user_value: The username of the associated AWS Single Sign-On User for this User Profile. If the Domain's AuthMode is SSO, this field is required, and must match a valid username of a user in your directory. If the Domain's AuthMode is not SSO, this field cannot be specified.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] user_profile_name: The name for the User Profile.
        :param pulumi.Input[pulumi.InputType['UserProfileUserSettingsArgs']] user_settings: The user settings. See User Settings below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserProfileArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a SageMaker User Profile resource.

        ## Example Usage

        ### Basic usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.sagemaker.UserProfile("example",
            domain_id=test["id"],
            user_profile_name="example")
        ```

        ## Import

        Using `pulumi import`, import SageMaker User Profiles using the `arn`. For example:

        ```sh
        $ pulumi import aws:sagemaker/userProfile:UserProfile test_user_profile arn:aws:sagemaker:us-west-2:123456789012:user-profile/domain-id/profile-name
        ```

        :param str resource_name: The name of the resource.
        :param UserProfileArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserProfileArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_id: Optional[pulumi.Input[str]] = None,
                 single_sign_on_user_identifier: Optional[pulumi.Input[str]] = None,
                 single_sign_on_user_value: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 user_profile_name: Optional[pulumi.Input[str]] = None,
                 user_settings: Optional[pulumi.Input[pulumi.InputType['UserProfileUserSettingsArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserProfileArgs.__new__(UserProfileArgs)

            if domain_id is None and not opts.urn:
                raise TypeError("Missing required property 'domain_id'")
            __props__.__dict__["domain_id"] = domain_id
            __props__.__dict__["single_sign_on_user_identifier"] = single_sign_on_user_identifier
            __props__.__dict__["single_sign_on_user_value"] = single_sign_on_user_value
            __props__.__dict__["tags"] = tags
            if user_profile_name is None and not opts.urn:
                raise TypeError("Missing required property 'user_profile_name'")
            __props__.__dict__["user_profile_name"] = user_profile_name
            __props__.__dict__["user_settings"] = user_settings
            __props__.__dict__["arn"] = None
            __props__.__dict__["home_efs_file_system_uid"] = None
            __props__.__dict__["tags_all"] = None
        super(UserProfile, __self__).__init__(
            'aws:sagemaker/userProfile:UserProfile',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            domain_id: Optional[pulumi.Input[str]] = None,
            home_efs_file_system_uid: Optional[pulumi.Input[str]] = None,
            single_sign_on_user_identifier: Optional[pulumi.Input[str]] = None,
            single_sign_on_user_value: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            user_profile_name: Optional[pulumi.Input[str]] = None,
            user_settings: Optional[pulumi.Input[pulumi.InputType['UserProfileUserSettingsArgs']]] = None) -> 'UserProfile':
        """
        Get an existing UserProfile resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The user profile Amazon Resource Name (ARN).
        :param pulumi.Input[str] domain_id: The ID of the associated Domain.
        :param pulumi.Input[str] home_efs_file_system_uid: The ID of the user's profile in the Amazon Elastic File System (EFS) volume.
        :param pulumi.Input[str] single_sign_on_user_identifier: A specifier for the type of value specified in `single_sign_on_user_value`. Currently, the only supported value is `UserName`. If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not SSO, this field cannot be specified.
        :param pulumi.Input[str] single_sign_on_user_value: The username of the associated AWS Single Sign-On User for this User Profile. If the Domain's AuthMode is SSO, this field is required, and must match a valid username of a user in your directory. If the Domain's AuthMode is not SSO, this field cannot be specified.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] user_profile_name: The name for the User Profile.
        :param pulumi.Input[pulumi.InputType['UserProfileUserSettingsArgs']] user_settings: The user settings. See User Settings below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserProfileState.__new__(_UserProfileState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["domain_id"] = domain_id
        __props__.__dict__["home_efs_file_system_uid"] = home_efs_file_system_uid
        __props__.__dict__["single_sign_on_user_identifier"] = single_sign_on_user_identifier
        __props__.__dict__["single_sign_on_user_value"] = single_sign_on_user_value
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["user_profile_name"] = user_profile_name
        __props__.__dict__["user_settings"] = user_settings
        return UserProfile(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The user profile Amazon Resource Name (ARN).
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="domainId")
    def domain_id(self) -> pulumi.Output[str]:
        """
        The ID of the associated Domain.
        """
        return pulumi.get(self, "domain_id")

    @property
    @pulumi.getter(name="homeEfsFileSystemUid")
    def home_efs_file_system_uid(self) -> pulumi.Output[str]:
        """
        The ID of the user's profile in the Amazon Elastic File System (EFS) volume.
        """
        return pulumi.get(self, "home_efs_file_system_uid")

    @property
    @pulumi.getter(name="singleSignOnUserIdentifier")
    def single_sign_on_user_identifier(self) -> pulumi.Output[Optional[str]]:
        """
        A specifier for the type of value specified in `single_sign_on_user_value`. Currently, the only supported value is `UserName`. If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not SSO, this field cannot be specified.
        """
        return pulumi.get(self, "single_sign_on_user_identifier")

    @property
    @pulumi.getter(name="singleSignOnUserValue")
    def single_sign_on_user_value(self) -> pulumi.Output[Optional[str]]:
        """
        The username of the associated AWS Single Sign-On User for this User Profile. If the Domain's AuthMode is SSO, this field is required, and must match a valid username of a user in your directory. If the Domain's AuthMode is not SSO, this field cannot be specified.
        """
        return pulumi.get(self, "single_sign_on_user_value")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter(name="userProfileName")
    def user_profile_name(self) -> pulumi.Output[str]:
        """
        The name for the User Profile.
        """
        return pulumi.get(self, "user_profile_name")

    @property
    @pulumi.getter(name="userSettings")
    def user_settings(self) -> pulumi.Output[Optional['outputs.UserProfileUserSettings']]:
        """
        The user settings. See User Settings below.
        """
        return pulumi.get(self, "user_settings")

