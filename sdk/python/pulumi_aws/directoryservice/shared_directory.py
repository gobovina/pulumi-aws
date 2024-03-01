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

__all__ = ['SharedDirectoryArgs', 'SharedDirectory']

@pulumi.input_type
class SharedDirectoryArgs:
    def __init__(__self__, *,
                 directory_id: pulumi.Input[str],
                 target: pulumi.Input['SharedDirectoryTargetArgs'],
                 method: Optional[pulumi.Input[str]] = None,
                 notes: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SharedDirectory resource.
        :param pulumi.Input[str] directory_id: Identifier of the Managed Microsoft AD directory that you want to share with other accounts.
        :param pulumi.Input['SharedDirectoryTargetArgs'] target: Identifier for the directory consumer account with whom the directory is to be shared. See below.
               
               The following arguments are optional:
        :param pulumi.Input[str] method: Method used when sharing a directory. Valid values are `ORGANIZATIONS` and `HANDSHAKE`. Default is `HANDSHAKE`.
        :param pulumi.Input[str] notes: Message sent by the directory owner to the directory consumer to help the directory consumer administrator determine whether to approve or reject the share invitation.
        """
        pulumi.set(__self__, "directory_id", directory_id)
        pulumi.set(__self__, "target", target)
        if method is not None:
            pulumi.set(__self__, "method", method)
        if notes is not None:
            pulumi.set(__self__, "notes", notes)

    @property
    @pulumi.getter(name="directoryId")
    def directory_id(self) -> pulumi.Input[str]:
        """
        Identifier of the Managed Microsoft AD directory that you want to share with other accounts.
        """
        return pulumi.get(self, "directory_id")

    @directory_id.setter
    def directory_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "directory_id", value)

    @property
    @pulumi.getter
    def target(self) -> pulumi.Input['SharedDirectoryTargetArgs']:
        """
        Identifier for the directory consumer account with whom the directory is to be shared. See below.

        The following arguments are optional:
        """
        return pulumi.get(self, "target")

    @target.setter
    def target(self, value: pulumi.Input['SharedDirectoryTargetArgs']):
        pulumi.set(self, "target", value)

    @property
    @pulumi.getter
    def method(self) -> Optional[pulumi.Input[str]]:
        """
        Method used when sharing a directory. Valid values are `ORGANIZATIONS` and `HANDSHAKE`. Default is `HANDSHAKE`.
        """
        return pulumi.get(self, "method")

    @method.setter
    def method(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "method", value)

    @property
    @pulumi.getter
    def notes(self) -> Optional[pulumi.Input[str]]:
        """
        Message sent by the directory owner to the directory consumer to help the directory consumer administrator determine whether to approve or reject the share invitation.
        """
        return pulumi.get(self, "notes")

    @notes.setter
    def notes(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "notes", value)


@pulumi.input_type
class _SharedDirectoryState:
    def __init__(__self__, *,
                 directory_id: Optional[pulumi.Input[str]] = None,
                 method: Optional[pulumi.Input[str]] = None,
                 notes: Optional[pulumi.Input[str]] = None,
                 shared_directory_id: Optional[pulumi.Input[str]] = None,
                 target: Optional[pulumi.Input['SharedDirectoryTargetArgs']] = None):
        """
        Input properties used for looking up and filtering SharedDirectory resources.
        :param pulumi.Input[str] directory_id: Identifier of the Managed Microsoft AD directory that you want to share with other accounts.
        :param pulumi.Input[str] method: Method used when sharing a directory. Valid values are `ORGANIZATIONS` and `HANDSHAKE`. Default is `HANDSHAKE`.
        :param pulumi.Input[str] notes: Message sent by the directory owner to the directory consumer to help the directory consumer administrator determine whether to approve or reject the share invitation.
        :param pulumi.Input[str] shared_directory_id: Identifier of the directory that is stored in the directory consumer account that corresponds to the shared directory in the owner account.
        :param pulumi.Input['SharedDirectoryTargetArgs'] target: Identifier for the directory consumer account with whom the directory is to be shared. See below.
               
               The following arguments are optional:
        """
        if directory_id is not None:
            pulumi.set(__self__, "directory_id", directory_id)
        if method is not None:
            pulumi.set(__self__, "method", method)
        if notes is not None:
            pulumi.set(__self__, "notes", notes)
        if shared_directory_id is not None:
            pulumi.set(__self__, "shared_directory_id", shared_directory_id)
        if target is not None:
            pulumi.set(__self__, "target", target)

    @property
    @pulumi.getter(name="directoryId")
    def directory_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the Managed Microsoft AD directory that you want to share with other accounts.
        """
        return pulumi.get(self, "directory_id")

    @directory_id.setter
    def directory_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "directory_id", value)

    @property
    @pulumi.getter
    def method(self) -> Optional[pulumi.Input[str]]:
        """
        Method used when sharing a directory. Valid values are `ORGANIZATIONS` and `HANDSHAKE`. Default is `HANDSHAKE`.
        """
        return pulumi.get(self, "method")

    @method.setter
    def method(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "method", value)

    @property
    @pulumi.getter
    def notes(self) -> Optional[pulumi.Input[str]]:
        """
        Message sent by the directory owner to the directory consumer to help the directory consumer administrator determine whether to approve or reject the share invitation.
        """
        return pulumi.get(self, "notes")

    @notes.setter
    def notes(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "notes", value)

    @property
    @pulumi.getter(name="sharedDirectoryId")
    def shared_directory_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the directory that is stored in the directory consumer account that corresponds to the shared directory in the owner account.
        """
        return pulumi.get(self, "shared_directory_id")

    @shared_directory_id.setter
    def shared_directory_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "shared_directory_id", value)

    @property
    @pulumi.getter
    def target(self) -> Optional[pulumi.Input['SharedDirectoryTargetArgs']]:
        """
        Identifier for the directory consumer account with whom the directory is to be shared. See below.

        The following arguments are optional:
        """
        return pulumi.get(self, "target")

    @target.setter
    def target(self, value: Optional[pulumi.Input['SharedDirectoryTargetArgs']]):
        pulumi.set(self, "target", value)


class SharedDirectory(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 directory_id: Optional[pulumi.Input[str]] = None,
                 method: Optional[pulumi.Input[str]] = None,
                 notes: Optional[pulumi.Input[str]] = None,
                 target: Optional[pulumi.Input[pulumi.InputType['SharedDirectoryTargetArgs']]] = None,
                 __props__=None):
        """
        Manages a directory in your account (directory owner) shared with another account (directory consumer).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.directoryservice.Directory("example",
            name="tf-example",
            password="SuperSecretPassw0rd",
            type="MicrosoftAD",
            edition="Standard",
            vpc_settings=aws.directoryservice.DirectoryVpcSettingsArgs(
                vpc_id=example_aws_vpc["id"],
                subnet_ids=[__item["id"] for __item in example_aws_subnet],
            ))
        example_shared_directory = aws.directoryservice.SharedDirectory("example",
            directory_id=example.id,
            notes="You wanna have a catch?",
            target=aws.directoryservice.SharedDirectoryTargetArgs(
                id=receiver["accountId"],
            ))
        ```

        ## Import

        Using `pulumi import`, import Directory Service Shared Directories using the owner directory ID/shared directory ID. For example:

        ```sh
         $ pulumi import aws:directoryservice/sharedDirectory:SharedDirectory example d-1234567890/d-9267633ece
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] directory_id: Identifier of the Managed Microsoft AD directory that you want to share with other accounts.
        :param pulumi.Input[str] method: Method used when sharing a directory. Valid values are `ORGANIZATIONS` and `HANDSHAKE`. Default is `HANDSHAKE`.
        :param pulumi.Input[str] notes: Message sent by the directory owner to the directory consumer to help the directory consumer administrator determine whether to approve or reject the share invitation.
        :param pulumi.Input[pulumi.InputType['SharedDirectoryTargetArgs']] target: Identifier for the directory consumer account with whom the directory is to be shared. See below.
               
               The following arguments are optional:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SharedDirectoryArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a directory in your account (directory owner) shared with another account (directory consumer).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.directoryservice.Directory("example",
            name="tf-example",
            password="SuperSecretPassw0rd",
            type="MicrosoftAD",
            edition="Standard",
            vpc_settings=aws.directoryservice.DirectoryVpcSettingsArgs(
                vpc_id=example_aws_vpc["id"],
                subnet_ids=[__item["id"] for __item in example_aws_subnet],
            ))
        example_shared_directory = aws.directoryservice.SharedDirectory("example",
            directory_id=example.id,
            notes="You wanna have a catch?",
            target=aws.directoryservice.SharedDirectoryTargetArgs(
                id=receiver["accountId"],
            ))
        ```

        ## Import

        Using `pulumi import`, import Directory Service Shared Directories using the owner directory ID/shared directory ID. For example:

        ```sh
         $ pulumi import aws:directoryservice/sharedDirectory:SharedDirectory example d-1234567890/d-9267633ece
        ```

        :param str resource_name: The name of the resource.
        :param SharedDirectoryArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SharedDirectoryArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 directory_id: Optional[pulumi.Input[str]] = None,
                 method: Optional[pulumi.Input[str]] = None,
                 notes: Optional[pulumi.Input[str]] = None,
                 target: Optional[pulumi.Input[pulumi.InputType['SharedDirectoryTargetArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SharedDirectoryArgs.__new__(SharedDirectoryArgs)

            if directory_id is None and not opts.urn:
                raise TypeError("Missing required property 'directory_id'")
            __props__.__dict__["directory_id"] = directory_id
            __props__.__dict__["method"] = method
            __props__.__dict__["notes"] = None if notes is None else pulumi.Output.secret(notes)
            if target is None and not opts.urn:
                raise TypeError("Missing required property 'target'")
            __props__.__dict__["target"] = target
            __props__.__dict__["shared_directory_id"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["notes"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(SharedDirectory, __self__).__init__(
            'aws:directoryservice/sharedDirectory:SharedDirectory',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            directory_id: Optional[pulumi.Input[str]] = None,
            method: Optional[pulumi.Input[str]] = None,
            notes: Optional[pulumi.Input[str]] = None,
            shared_directory_id: Optional[pulumi.Input[str]] = None,
            target: Optional[pulumi.Input[pulumi.InputType['SharedDirectoryTargetArgs']]] = None) -> 'SharedDirectory':
        """
        Get an existing SharedDirectory resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] directory_id: Identifier of the Managed Microsoft AD directory that you want to share with other accounts.
        :param pulumi.Input[str] method: Method used when sharing a directory. Valid values are `ORGANIZATIONS` and `HANDSHAKE`. Default is `HANDSHAKE`.
        :param pulumi.Input[str] notes: Message sent by the directory owner to the directory consumer to help the directory consumer administrator determine whether to approve or reject the share invitation.
        :param pulumi.Input[str] shared_directory_id: Identifier of the directory that is stored in the directory consumer account that corresponds to the shared directory in the owner account.
        :param pulumi.Input[pulumi.InputType['SharedDirectoryTargetArgs']] target: Identifier for the directory consumer account with whom the directory is to be shared. See below.
               
               The following arguments are optional:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SharedDirectoryState.__new__(_SharedDirectoryState)

        __props__.__dict__["directory_id"] = directory_id
        __props__.__dict__["method"] = method
        __props__.__dict__["notes"] = notes
        __props__.__dict__["shared_directory_id"] = shared_directory_id
        __props__.__dict__["target"] = target
        return SharedDirectory(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="directoryId")
    def directory_id(self) -> pulumi.Output[str]:
        """
        Identifier of the Managed Microsoft AD directory that you want to share with other accounts.
        """
        return pulumi.get(self, "directory_id")

    @property
    @pulumi.getter
    def method(self) -> pulumi.Output[Optional[str]]:
        """
        Method used when sharing a directory. Valid values are `ORGANIZATIONS` and `HANDSHAKE`. Default is `HANDSHAKE`.
        """
        return pulumi.get(self, "method")

    @property
    @pulumi.getter
    def notes(self) -> pulumi.Output[Optional[str]]:
        """
        Message sent by the directory owner to the directory consumer to help the directory consumer administrator determine whether to approve or reject the share invitation.
        """
        return pulumi.get(self, "notes")

    @property
    @pulumi.getter(name="sharedDirectoryId")
    def shared_directory_id(self) -> pulumi.Output[str]:
        """
        Identifier of the directory that is stored in the directory consumer account that corresponds to the shared directory in the owner account.
        """
        return pulumi.get(self, "shared_directory_id")

    @property
    @pulumi.getter
    def target(self) -> pulumi.Output['outputs.SharedDirectoryTarget']:
        """
        Identifier for the directory consumer account with whom the directory is to be shared. See below.

        The following arguments are optional:
        """
        return pulumi.get(self, "target")

