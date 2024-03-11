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

__all__ = ['BackupPolicyArgs', 'BackupPolicy']

@pulumi.input_type
class BackupPolicyArgs:
    def __init__(__self__, *,
                 backup_policy: pulumi.Input['BackupPolicyBackupPolicyArgs'],
                 file_system_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a BackupPolicy resource.
        :param pulumi.Input['BackupPolicyBackupPolicyArgs'] backup_policy: A backup_policy object (documented below).
        :param pulumi.Input[str] file_system_id: The ID of the EFS file system.
        """
        pulumi.set(__self__, "backup_policy", backup_policy)
        pulumi.set(__self__, "file_system_id", file_system_id)

    @property
    @pulumi.getter(name="backupPolicy")
    def backup_policy(self) -> pulumi.Input['BackupPolicyBackupPolicyArgs']:
        """
        A backup_policy object (documented below).
        """
        return pulumi.get(self, "backup_policy")

    @backup_policy.setter
    def backup_policy(self, value: pulumi.Input['BackupPolicyBackupPolicyArgs']):
        pulumi.set(self, "backup_policy", value)

    @property
    @pulumi.getter(name="fileSystemId")
    def file_system_id(self) -> pulumi.Input[str]:
        """
        The ID of the EFS file system.
        """
        return pulumi.get(self, "file_system_id")

    @file_system_id.setter
    def file_system_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "file_system_id", value)


@pulumi.input_type
class _BackupPolicyState:
    def __init__(__self__, *,
                 backup_policy: Optional[pulumi.Input['BackupPolicyBackupPolicyArgs']] = None,
                 file_system_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering BackupPolicy resources.
        :param pulumi.Input['BackupPolicyBackupPolicyArgs'] backup_policy: A backup_policy object (documented below).
        :param pulumi.Input[str] file_system_id: The ID of the EFS file system.
        """
        if backup_policy is not None:
            pulumi.set(__self__, "backup_policy", backup_policy)
        if file_system_id is not None:
            pulumi.set(__self__, "file_system_id", file_system_id)

    @property
    @pulumi.getter(name="backupPolicy")
    def backup_policy(self) -> Optional[pulumi.Input['BackupPolicyBackupPolicyArgs']]:
        """
        A backup_policy object (documented below).
        """
        return pulumi.get(self, "backup_policy")

    @backup_policy.setter
    def backup_policy(self, value: Optional[pulumi.Input['BackupPolicyBackupPolicyArgs']]):
        pulumi.set(self, "backup_policy", value)

    @property
    @pulumi.getter(name="fileSystemId")
    def file_system_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the EFS file system.
        """
        return pulumi.get(self, "file_system_id")

    @file_system_id.setter
    def file_system_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "file_system_id", value)


class BackupPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backup_policy: Optional[pulumi.Input[pulumi.InputType['BackupPolicyBackupPolicyArgs']]] = None,
                 file_system_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an Elastic File System (EFS) Backup Policy resource.
        Backup policies turn automatic backups on or off for an existing file system.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        fs = aws.efs.FileSystem("fs", creation_token="my-product")
        policy = aws.efs.BackupPolicy("policy",
            file_system_id=fs.id,
            backup_policy=aws.efs.BackupPolicyBackupPolicyArgs(
                status="ENABLED",
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import the EFS backup policies using the `id`. For example:

        ```sh
        $ pulumi import aws:efs/backupPolicy:BackupPolicy example fs-6fa144c6
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['BackupPolicyBackupPolicyArgs']] backup_policy: A backup_policy object (documented below).
        :param pulumi.Input[str] file_system_id: The ID of the EFS file system.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BackupPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an Elastic File System (EFS) Backup Policy resource.
        Backup policies turn automatic backups on or off for an existing file system.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        fs = aws.efs.FileSystem("fs", creation_token="my-product")
        policy = aws.efs.BackupPolicy("policy",
            file_system_id=fs.id,
            backup_policy=aws.efs.BackupPolicyBackupPolicyArgs(
                status="ENABLED",
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import the EFS backup policies using the `id`. For example:

        ```sh
        $ pulumi import aws:efs/backupPolicy:BackupPolicy example fs-6fa144c6
        ```

        :param str resource_name: The name of the resource.
        :param BackupPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BackupPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backup_policy: Optional[pulumi.Input[pulumi.InputType['BackupPolicyBackupPolicyArgs']]] = None,
                 file_system_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BackupPolicyArgs.__new__(BackupPolicyArgs)

            if backup_policy is None and not opts.urn:
                raise TypeError("Missing required property 'backup_policy'")
            __props__.__dict__["backup_policy"] = backup_policy
            if file_system_id is None and not opts.urn:
                raise TypeError("Missing required property 'file_system_id'")
            __props__.__dict__["file_system_id"] = file_system_id
        super(BackupPolicy, __self__).__init__(
            'aws:efs/backupPolicy:BackupPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            backup_policy: Optional[pulumi.Input[pulumi.InputType['BackupPolicyBackupPolicyArgs']]] = None,
            file_system_id: Optional[pulumi.Input[str]] = None) -> 'BackupPolicy':
        """
        Get an existing BackupPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['BackupPolicyBackupPolicyArgs']] backup_policy: A backup_policy object (documented below).
        :param pulumi.Input[str] file_system_id: The ID of the EFS file system.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BackupPolicyState.__new__(_BackupPolicyState)

        __props__.__dict__["backup_policy"] = backup_policy
        __props__.__dict__["file_system_id"] = file_system_id
        return BackupPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="backupPolicy")
    def backup_policy(self) -> pulumi.Output['outputs.BackupPolicyBackupPolicy']:
        """
        A backup_policy object (documented below).
        """
        return pulumi.get(self, "backup_policy")

    @property
    @pulumi.getter(name="fileSystemId")
    def file_system_id(self) -> pulumi.Output[str]:
        """
        The ID of the EFS file system.
        """
        return pulumi.get(self, "file_system_id")

