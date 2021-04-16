# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['UserGroupArgs', 'UserGroup']

@pulumi.input_type
class UserGroupArgs:
    def __init__(__self__, *,
                 user_pool_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 precedence: Optional[pulumi.Input[int]] = None,
                 role_arn: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a UserGroup resource.
        :param pulumi.Input[str] user_pool_id: The user pool ID.
        :param pulumi.Input[str] description: The description of the user group.
        :param pulumi.Input[str] name: The name of the user group.
        :param pulumi.Input[int] precedence: The precedence of the user group.
        :param pulumi.Input[str] role_arn: The ARN of the IAM role to be associated with the user group.
        """
        pulumi.set(__self__, "user_pool_id", user_pool_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if precedence is not None:
            pulumi.set(__self__, "precedence", precedence)
        if role_arn is not None:
            pulumi.set(__self__, "role_arn", role_arn)

    @property
    @pulumi.getter(name="userPoolId")
    def user_pool_id(self) -> pulumi.Input[str]:
        """
        The user pool ID.
        """
        return pulumi.get(self, "user_pool_id")

    @user_pool_id.setter
    def user_pool_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_pool_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the user group.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the user group.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def precedence(self) -> Optional[pulumi.Input[int]]:
        """
        The precedence of the user group.
        """
        return pulumi.get(self, "precedence")

    @precedence.setter
    def precedence(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "precedence", value)

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the IAM role to be associated with the user group.
        """
        return pulumi.get(self, "role_arn")

    @role_arn.setter
    def role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_arn", value)


@pulumi.input_type
class _UserGroupState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 precedence: Optional[pulumi.Input[int]] = None,
                 role_arn: Optional[pulumi.Input[str]] = None,
                 user_pool_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering UserGroup resources.
        :param pulumi.Input[str] description: The description of the user group.
        :param pulumi.Input[str] name: The name of the user group.
        :param pulumi.Input[int] precedence: The precedence of the user group.
        :param pulumi.Input[str] role_arn: The ARN of the IAM role to be associated with the user group.
        :param pulumi.Input[str] user_pool_id: The user pool ID.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if precedence is not None:
            pulumi.set(__self__, "precedence", precedence)
        if role_arn is not None:
            pulumi.set(__self__, "role_arn", role_arn)
        if user_pool_id is not None:
            pulumi.set(__self__, "user_pool_id", user_pool_id)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the user group.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the user group.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def precedence(self) -> Optional[pulumi.Input[int]]:
        """
        The precedence of the user group.
        """
        return pulumi.get(self, "precedence")

    @precedence.setter
    def precedence(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "precedence", value)

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the IAM role to be associated with the user group.
        """
        return pulumi.get(self, "role_arn")

    @role_arn.setter
    def role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_arn", value)

    @property
    @pulumi.getter(name="userPoolId")
    def user_pool_id(self) -> Optional[pulumi.Input[str]]:
        """
        The user pool ID.
        """
        return pulumi.get(self, "user_pool_id")

    @user_pool_id.setter
    def user_pool_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_pool_id", value)


class UserGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 precedence: Optional[pulumi.Input[int]] = None,
                 role_arn: Optional[pulumi.Input[str]] = None,
                 user_pool_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cognito User Group resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        main_user_pool = aws.cognito.UserPool("mainUserPool")
        group_role = aws.iam.Role("groupRole", assume_role_policy=\"\"\"{
          "Version": "2012-10-17",
          "Statement": [
            {
              "Sid": "",
              "Effect": "Allow",
              "Principal": {
                "Federated": "cognito-identity.amazonaws.com"
              },
              "Action": "sts:AssumeRoleWithWebIdentity",
              "Condition": {
                "StringEquals": {
                  "cognito-identity.amazonaws.com:aud": "us-east-1:12345678-dead-beef-cafe-123456790ab"
                },
                "ForAnyValue:StringLike": {
                  "cognito-identity.amazonaws.com:amr": "authenticated"
                }
              }
            }
          ]
        }
        \"\"\")
        main_user_group = aws.cognito.UserGroup("mainUserGroup",
            user_pool_id=main_user_pool.id,
            description="Managed by Pulumi",
            precedence=42,
            role_arn=group_role.arn)
        ```

        ## Import

        Cognito User Groups can be imported using the `user_pool_id`/`name` attributes concatenated, e.g.

        ```sh
         $ pulumi import aws:cognito/userGroup:UserGroup group us-east-1_vG78M4goG/user-group
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the user group.
        :param pulumi.Input[str] name: The name of the user group.
        :param pulumi.Input[int] precedence: The precedence of the user group.
        :param pulumi.Input[str] role_arn: The ARN of the IAM role to be associated with the user group.
        :param pulumi.Input[str] user_pool_id: The user pool ID.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cognito User Group resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        main_user_pool = aws.cognito.UserPool("mainUserPool")
        group_role = aws.iam.Role("groupRole", assume_role_policy=\"\"\"{
          "Version": "2012-10-17",
          "Statement": [
            {
              "Sid": "",
              "Effect": "Allow",
              "Principal": {
                "Federated": "cognito-identity.amazonaws.com"
              },
              "Action": "sts:AssumeRoleWithWebIdentity",
              "Condition": {
                "StringEquals": {
                  "cognito-identity.amazonaws.com:aud": "us-east-1:12345678-dead-beef-cafe-123456790ab"
                },
                "ForAnyValue:StringLike": {
                  "cognito-identity.amazonaws.com:amr": "authenticated"
                }
              }
            }
          ]
        }
        \"\"\")
        main_user_group = aws.cognito.UserGroup("mainUserGroup",
            user_pool_id=main_user_pool.id,
            description="Managed by Pulumi",
            precedence=42,
            role_arn=group_role.arn)
        ```

        ## Import

        Cognito User Groups can be imported using the `user_pool_id`/`name` attributes concatenated, e.g.

        ```sh
         $ pulumi import aws:cognito/userGroup:UserGroup group us-east-1_vG78M4goG/user-group
        ```

        :param str resource_name: The name of the resource.
        :param UserGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 precedence: Optional[pulumi.Input[int]] = None,
                 role_arn: Optional[pulumi.Input[str]] = None,
                 user_pool_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserGroupArgs.__new__(UserGroupArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["precedence"] = precedence
            __props__.__dict__["role_arn"] = role_arn
            if user_pool_id is None and not opts.urn:
                raise TypeError("Missing required property 'user_pool_id'")
            __props__.__dict__["user_pool_id"] = user_pool_id
        super(UserGroup, __self__).__init__(
            'aws:cognito/userGroup:UserGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            precedence: Optional[pulumi.Input[int]] = None,
            role_arn: Optional[pulumi.Input[str]] = None,
            user_pool_id: Optional[pulumi.Input[str]] = None) -> 'UserGroup':
        """
        Get an existing UserGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the user group.
        :param pulumi.Input[str] name: The name of the user group.
        :param pulumi.Input[int] precedence: The precedence of the user group.
        :param pulumi.Input[str] role_arn: The ARN of the IAM role to be associated with the user group.
        :param pulumi.Input[str] user_pool_id: The user pool ID.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserGroupState.__new__(_UserGroupState)

        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["precedence"] = precedence
        __props__.__dict__["role_arn"] = role_arn
        __props__.__dict__["user_pool_id"] = user_pool_id
        return UserGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the user group.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the user group.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def precedence(self) -> pulumi.Output[Optional[int]]:
        """
        The precedence of the user group.
        """
        return pulumi.get(self, "precedence")

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> pulumi.Output[Optional[str]]:
        """
        The ARN of the IAM role to be associated with the user group.
        """
        return pulumi.get(self, "role_arn")

    @property
    @pulumi.getter(name="userPoolId")
    def user_pool_id(self) -> pulumi.Output[str]:
        """
        The user pool ID.
        """
        return pulumi.get(self, "user_pool_id")

