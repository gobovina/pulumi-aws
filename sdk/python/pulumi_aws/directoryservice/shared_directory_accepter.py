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

__all__ = ['SharedDirectoryAccepterArgs', 'SharedDirectoryAccepter']

@pulumi.input_type
class SharedDirectoryAccepterArgs:
    def __init__(__self__, *,
                 shared_directory_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a SharedDirectoryAccepter resource.
        :param pulumi.Input[str] shared_directory_id: Identifier of the directory that is stored in the directory consumer account that corresponds to the shared directory in the owner account.
        """
        pulumi.set(__self__, "shared_directory_id", shared_directory_id)

    @property
    @pulumi.getter(name="sharedDirectoryId")
    def shared_directory_id(self) -> pulumi.Input[str]:
        """
        Identifier of the directory that is stored in the directory consumer account that corresponds to the shared directory in the owner account.
        """
        return pulumi.get(self, "shared_directory_id")

    @shared_directory_id.setter
    def shared_directory_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "shared_directory_id", value)


@pulumi.input_type
class _SharedDirectoryAccepterState:
    def __init__(__self__, *,
                 method: Optional[pulumi.Input[str]] = None,
                 notes: Optional[pulumi.Input[str]] = None,
                 owner_account_id: Optional[pulumi.Input[str]] = None,
                 owner_directory_id: Optional[pulumi.Input[str]] = None,
                 shared_directory_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SharedDirectoryAccepter resources.
        :param pulumi.Input[str] method: Method used when sharing a directory (i.e., `ORGANIZATIONS` or `HANDSHAKE`).
        :param pulumi.Input[str] notes: Message sent by the directory owner to the directory consumer to help the directory consumer administrator determine whether to approve or reject the share invitation.
        :param pulumi.Input[str] owner_account_id: Account identifier of the directory owner.
        :param pulumi.Input[str] owner_directory_id: Identifier of the Managed Microsoft AD directory from the perspective of the directory owner.
        :param pulumi.Input[str] shared_directory_id: Identifier of the directory that is stored in the directory consumer account that corresponds to the shared directory in the owner account.
        """
        if method is not None:
            pulumi.set(__self__, "method", method)
        if notes is not None:
            pulumi.set(__self__, "notes", notes)
        if owner_account_id is not None:
            pulumi.set(__self__, "owner_account_id", owner_account_id)
        if owner_directory_id is not None:
            pulumi.set(__self__, "owner_directory_id", owner_directory_id)
        if shared_directory_id is not None:
            pulumi.set(__self__, "shared_directory_id", shared_directory_id)

    @property
    @pulumi.getter
    def method(self) -> Optional[pulumi.Input[str]]:
        """
        Method used when sharing a directory (i.e., `ORGANIZATIONS` or `HANDSHAKE`).
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
    @pulumi.getter(name="ownerAccountId")
    def owner_account_id(self) -> Optional[pulumi.Input[str]]:
        """
        Account identifier of the directory owner.
        """
        return pulumi.get(self, "owner_account_id")

    @owner_account_id.setter
    def owner_account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner_account_id", value)

    @property
    @pulumi.getter(name="ownerDirectoryId")
    def owner_directory_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the Managed Microsoft AD directory from the perspective of the directory owner.
        """
        return pulumi.get(self, "owner_directory_id")

    @owner_directory_id.setter
    def owner_directory_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner_directory_id", value)

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


class SharedDirectoryAccepter(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 shared_directory_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Accepts a shared directory in a consumer account.

        > **NOTE:** Destroying this resource removes the shared directory from the consumer account only.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.directoryservice.SharedDirectory("example",
            directory_id=example_aws_directory_service_directory["id"],
            notes="example",
            target={
                "id": receiver["accountId"],
            })
        example_shared_directory_accepter = aws.directoryservice.SharedDirectoryAccepter("example", shared_directory_id=example.shared_directory_id)
        ```

        ## Import

        Using `pulumi import`, import Directory Service Shared Directories using the shared directory ID. For example:

        ```sh
        $ pulumi import aws:directoryservice/sharedDirectoryAccepter:SharedDirectoryAccepter example d-9267633ece
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] shared_directory_id: Identifier of the directory that is stored in the directory consumer account that corresponds to the shared directory in the owner account.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SharedDirectoryAccepterArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Accepts a shared directory in a consumer account.

        > **NOTE:** Destroying this resource removes the shared directory from the consumer account only.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.directoryservice.SharedDirectory("example",
            directory_id=example_aws_directory_service_directory["id"],
            notes="example",
            target={
                "id": receiver["accountId"],
            })
        example_shared_directory_accepter = aws.directoryservice.SharedDirectoryAccepter("example", shared_directory_id=example.shared_directory_id)
        ```

        ## Import

        Using `pulumi import`, import Directory Service Shared Directories using the shared directory ID. For example:

        ```sh
        $ pulumi import aws:directoryservice/sharedDirectoryAccepter:SharedDirectoryAccepter example d-9267633ece
        ```

        :param str resource_name: The name of the resource.
        :param SharedDirectoryAccepterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SharedDirectoryAccepterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 shared_directory_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SharedDirectoryAccepterArgs.__new__(SharedDirectoryAccepterArgs)

            if shared_directory_id is None and not opts.urn:
                raise TypeError("Missing required property 'shared_directory_id'")
            __props__.__dict__["shared_directory_id"] = shared_directory_id
            __props__.__dict__["method"] = None
            __props__.__dict__["notes"] = None
            __props__.__dict__["owner_account_id"] = None
            __props__.__dict__["owner_directory_id"] = None
        super(SharedDirectoryAccepter, __self__).__init__(
            'aws:directoryservice/sharedDirectoryAccepter:SharedDirectoryAccepter',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            method: Optional[pulumi.Input[str]] = None,
            notes: Optional[pulumi.Input[str]] = None,
            owner_account_id: Optional[pulumi.Input[str]] = None,
            owner_directory_id: Optional[pulumi.Input[str]] = None,
            shared_directory_id: Optional[pulumi.Input[str]] = None) -> 'SharedDirectoryAccepter':
        """
        Get an existing SharedDirectoryAccepter resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] method: Method used when sharing a directory (i.e., `ORGANIZATIONS` or `HANDSHAKE`).
        :param pulumi.Input[str] notes: Message sent by the directory owner to the directory consumer to help the directory consumer administrator determine whether to approve or reject the share invitation.
        :param pulumi.Input[str] owner_account_id: Account identifier of the directory owner.
        :param pulumi.Input[str] owner_directory_id: Identifier of the Managed Microsoft AD directory from the perspective of the directory owner.
        :param pulumi.Input[str] shared_directory_id: Identifier of the directory that is stored in the directory consumer account that corresponds to the shared directory in the owner account.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SharedDirectoryAccepterState.__new__(_SharedDirectoryAccepterState)

        __props__.__dict__["method"] = method
        __props__.__dict__["notes"] = notes
        __props__.__dict__["owner_account_id"] = owner_account_id
        __props__.__dict__["owner_directory_id"] = owner_directory_id
        __props__.__dict__["shared_directory_id"] = shared_directory_id
        return SharedDirectoryAccepter(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def method(self) -> pulumi.Output[str]:
        """
        Method used when sharing a directory (i.e., `ORGANIZATIONS` or `HANDSHAKE`).
        """
        return pulumi.get(self, "method")

    @property
    @pulumi.getter
    def notes(self) -> pulumi.Output[str]:
        """
        Message sent by the directory owner to the directory consumer to help the directory consumer administrator determine whether to approve or reject the share invitation.
        """
        return pulumi.get(self, "notes")

    @property
    @pulumi.getter(name="ownerAccountId")
    def owner_account_id(self) -> pulumi.Output[str]:
        """
        Account identifier of the directory owner.
        """
        return pulumi.get(self, "owner_account_id")

    @property
    @pulumi.getter(name="ownerDirectoryId")
    def owner_directory_id(self) -> pulumi.Output[str]:
        """
        Identifier of the Managed Microsoft AD directory from the perspective of the directory owner.
        """
        return pulumi.get(self, "owner_directory_id")

    @property
    @pulumi.getter(name="sharedDirectoryId")
    def shared_directory_id(self) -> pulumi.Output[str]:
        """
        Identifier of the directory that is stored in the directory consumer account that corresponds to the shared directory in the owner account.
        """
        return pulumi.get(self, "shared_directory_id")

