# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['PermissionArgs', 'Permission']

@pulumi.input_type
class PermissionArgs:
    def __init__(__self__, *,
                 user_arn: pulumi.Input[str],
                 allow_ssh: Optional[pulumi.Input[bool]] = None,
                 allow_sudo: Optional[pulumi.Input[bool]] = None,
                 level: Optional[pulumi.Input[str]] = None,
                 stack_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Permission resource.
        :param pulumi.Input[str] user_arn: The user's IAM ARN to set permissions for
        :param pulumi.Input[bool] allow_ssh: Whether the user is allowed to use SSH to communicate with the instance
        :param pulumi.Input[bool] allow_sudo: Whether the user is allowed to use sudo to elevate privileges
        :param pulumi.Input[str] level: The users permission level. Mus be one of `deny`, `show`, `deploy`, `manage`, `iam_only`
        :param pulumi.Input[str] stack_id: The stack to set the permissions for
        """
        pulumi.set(__self__, "user_arn", user_arn)
        if allow_ssh is not None:
            pulumi.set(__self__, "allow_ssh", allow_ssh)
        if allow_sudo is not None:
            pulumi.set(__self__, "allow_sudo", allow_sudo)
        if level is not None:
            pulumi.set(__self__, "level", level)
        if stack_id is not None:
            pulumi.set(__self__, "stack_id", stack_id)

    @property
    @pulumi.getter(name="userArn")
    def user_arn(self) -> pulumi.Input[str]:
        """
        The user's IAM ARN to set permissions for
        """
        return pulumi.get(self, "user_arn")

    @user_arn.setter
    def user_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_arn", value)

    @property
    @pulumi.getter(name="allowSsh")
    def allow_ssh(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the user is allowed to use SSH to communicate with the instance
        """
        return pulumi.get(self, "allow_ssh")

    @allow_ssh.setter
    def allow_ssh(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_ssh", value)

    @property
    @pulumi.getter(name="allowSudo")
    def allow_sudo(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the user is allowed to use sudo to elevate privileges
        """
        return pulumi.get(self, "allow_sudo")

    @allow_sudo.setter
    def allow_sudo(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_sudo", value)

    @property
    @pulumi.getter
    def level(self) -> Optional[pulumi.Input[str]]:
        """
        The users permission level. Mus be one of `deny`, `show`, `deploy`, `manage`, `iam_only`
        """
        return pulumi.get(self, "level")

    @level.setter
    def level(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "level", value)

    @property
    @pulumi.getter(name="stackId")
    def stack_id(self) -> Optional[pulumi.Input[str]]:
        """
        The stack to set the permissions for
        """
        return pulumi.get(self, "stack_id")

    @stack_id.setter
    def stack_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "stack_id", value)


@pulumi.input_type
class _PermissionState:
    def __init__(__self__, *,
                 allow_ssh: Optional[pulumi.Input[bool]] = None,
                 allow_sudo: Optional[pulumi.Input[bool]] = None,
                 level: Optional[pulumi.Input[str]] = None,
                 stack_id: Optional[pulumi.Input[str]] = None,
                 user_arn: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Permission resources.
        :param pulumi.Input[bool] allow_ssh: Whether the user is allowed to use SSH to communicate with the instance
        :param pulumi.Input[bool] allow_sudo: Whether the user is allowed to use sudo to elevate privileges
        :param pulumi.Input[str] level: The users permission level. Mus be one of `deny`, `show`, `deploy`, `manage`, `iam_only`
        :param pulumi.Input[str] stack_id: The stack to set the permissions for
        :param pulumi.Input[str] user_arn: The user's IAM ARN to set permissions for
        """
        if allow_ssh is not None:
            pulumi.set(__self__, "allow_ssh", allow_ssh)
        if allow_sudo is not None:
            pulumi.set(__self__, "allow_sudo", allow_sudo)
        if level is not None:
            pulumi.set(__self__, "level", level)
        if stack_id is not None:
            pulumi.set(__self__, "stack_id", stack_id)
        if user_arn is not None:
            pulumi.set(__self__, "user_arn", user_arn)

    @property
    @pulumi.getter(name="allowSsh")
    def allow_ssh(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the user is allowed to use SSH to communicate with the instance
        """
        return pulumi.get(self, "allow_ssh")

    @allow_ssh.setter
    def allow_ssh(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_ssh", value)

    @property
    @pulumi.getter(name="allowSudo")
    def allow_sudo(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the user is allowed to use sudo to elevate privileges
        """
        return pulumi.get(self, "allow_sudo")

    @allow_sudo.setter
    def allow_sudo(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_sudo", value)

    @property
    @pulumi.getter
    def level(self) -> Optional[pulumi.Input[str]]:
        """
        The users permission level. Mus be one of `deny`, `show`, `deploy`, `manage`, `iam_only`
        """
        return pulumi.get(self, "level")

    @level.setter
    def level(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "level", value)

    @property
    @pulumi.getter(name="stackId")
    def stack_id(self) -> Optional[pulumi.Input[str]]:
        """
        The stack to set the permissions for
        """
        return pulumi.get(self, "stack_id")

    @stack_id.setter
    def stack_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "stack_id", value)

    @property
    @pulumi.getter(name="userArn")
    def user_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The user's IAM ARN to set permissions for
        """
        return pulumi.get(self, "user_arn")

    @user_arn.setter
    def user_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_arn", value)


class Permission(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_ssh: Optional[pulumi.Input[bool]] = None,
                 allow_sudo: Optional[pulumi.Input[bool]] = None,
                 level: Optional[pulumi.Input[str]] = None,
                 stack_id: Optional[pulumi.Input[str]] = None,
                 user_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an OpsWorks permission resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        my_stack_permission = aws.opsworks.Permission("myStackPermission",
            allow_ssh=True,
            allow_sudo=True,
            level="iam_only",
            user_arn=aws_iam_user["user"]["arn"],
            stack_id=aws_opsworks_stack["stack"]["id"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_ssh: Whether the user is allowed to use SSH to communicate with the instance
        :param pulumi.Input[bool] allow_sudo: Whether the user is allowed to use sudo to elevate privileges
        :param pulumi.Input[str] level: The users permission level. Mus be one of `deny`, `show`, `deploy`, `manage`, `iam_only`
        :param pulumi.Input[str] stack_id: The stack to set the permissions for
        :param pulumi.Input[str] user_arn: The user's IAM ARN to set permissions for
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PermissionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an OpsWorks permission resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        my_stack_permission = aws.opsworks.Permission("myStackPermission",
            allow_ssh=True,
            allow_sudo=True,
            level="iam_only",
            user_arn=aws_iam_user["user"]["arn"],
            stack_id=aws_opsworks_stack["stack"]["id"])
        ```

        :param str resource_name: The name of the resource.
        :param PermissionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PermissionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_ssh: Optional[pulumi.Input[bool]] = None,
                 allow_sudo: Optional[pulumi.Input[bool]] = None,
                 level: Optional[pulumi.Input[str]] = None,
                 stack_id: Optional[pulumi.Input[str]] = None,
                 user_arn: Optional[pulumi.Input[str]] = None,
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
            __props__ = PermissionArgs.__new__(PermissionArgs)

            __props__.__dict__["allow_ssh"] = allow_ssh
            __props__.__dict__["allow_sudo"] = allow_sudo
            __props__.__dict__["level"] = level
            __props__.__dict__["stack_id"] = stack_id
            if user_arn is None and not opts.urn:
                raise TypeError("Missing required property 'user_arn'")
            __props__.__dict__["user_arn"] = user_arn
        super(Permission, __self__).__init__(
            'aws:opsworks/permission:Permission',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allow_ssh: Optional[pulumi.Input[bool]] = None,
            allow_sudo: Optional[pulumi.Input[bool]] = None,
            level: Optional[pulumi.Input[str]] = None,
            stack_id: Optional[pulumi.Input[str]] = None,
            user_arn: Optional[pulumi.Input[str]] = None) -> 'Permission':
        """
        Get an existing Permission resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_ssh: Whether the user is allowed to use SSH to communicate with the instance
        :param pulumi.Input[bool] allow_sudo: Whether the user is allowed to use sudo to elevate privileges
        :param pulumi.Input[str] level: The users permission level. Mus be one of `deny`, `show`, `deploy`, `manage`, `iam_only`
        :param pulumi.Input[str] stack_id: The stack to set the permissions for
        :param pulumi.Input[str] user_arn: The user's IAM ARN to set permissions for
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PermissionState.__new__(_PermissionState)

        __props__.__dict__["allow_ssh"] = allow_ssh
        __props__.__dict__["allow_sudo"] = allow_sudo
        __props__.__dict__["level"] = level
        __props__.__dict__["stack_id"] = stack_id
        __props__.__dict__["user_arn"] = user_arn
        return Permission(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allowSsh")
    def allow_ssh(self) -> pulumi.Output[bool]:
        """
        Whether the user is allowed to use SSH to communicate with the instance
        """
        return pulumi.get(self, "allow_ssh")

    @property
    @pulumi.getter(name="allowSudo")
    def allow_sudo(self) -> pulumi.Output[bool]:
        """
        Whether the user is allowed to use sudo to elevate privileges
        """
        return pulumi.get(self, "allow_sudo")

    @property
    @pulumi.getter
    def level(self) -> pulumi.Output[str]:
        """
        The users permission level. Mus be one of `deny`, `show`, `deploy`, `manage`, `iam_only`
        """
        return pulumi.get(self, "level")

    @property
    @pulumi.getter(name="stackId")
    def stack_id(self) -> pulumi.Output[str]:
        """
        The stack to set the permissions for
        """
        return pulumi.get(self, "stack_id")

    @property
    @pulumi.getter(name="userArn")
    def user_arn(self) -> pulumi.Output[str]:
        """
        The user's IAM ARN to set permissions for
        """
        return pulumi.get(self, "user_arn")

