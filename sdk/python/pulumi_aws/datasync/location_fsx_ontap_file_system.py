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

__all__ = ['LocationFsxOntapFileSystemArgs', 'LocationFsxOntapFileSystem']

@pulumi.input_type
class LocationFsxOntapFileSystemArgs:
    def __init__(__self__, *,
                 protocol: pulumi.Input['LocationFsxOntapFileSystemProtocolArgs'],
                 security_group_arns: pulumi.Input[Sequence[pulumi.Input[str]]],
                 storage_virtual_machine_arn: pulumi.Input[str],
                 subdirectory: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a LocationFsxOntapFileSystem resource.
        :param pulumi.Input['LocationFsxOntapFileSystemProtocolArgs'] protocol: The data transfer protocol that DataSync uses to access your Amazon FSx file system. See Protocol below.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_arns: The security groups that provide access to your file system's preferred subnet. The security groups must allow outbbound traffic on the following ports (depending on the protocol you use):
               * Network File System (NFS): TCP ports 111, 635, and 2049
               * Server Message Block (SMB): TCP port 445
        :param pulumi.Input[str] storage_virtual_machine_arn: The ARN of the SVM in your file system where you want to copy data to of from.
               
               The following arguments are optional:
        :param pulumi.Input[str] subdirectory: Path to the file share in the SVM where you'll copy your data. You can specify a junction path (also known as a mount point), qtree path (for NFS file shares), or share name (for SMB file shares) (e.g. `/vol1`, `/vol1/tree1`, `share1`).
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "protocol", protocol)
        pulumi.set(__self__, "security_group_arns", security_group_arns)
        pulumi.set(__self__, "storage_virtual_machine_arn", storage_virtual_machine_arn)
        if subdirectory is not None:
            pulumi.set(__self__, "subdirectory", subdirectory)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def protocol(self) -> pulumi.Input['LocationFsxOntapFileSystemProtocolArgs']:
        """
        The data transfer protocol that DataSync uses to access your Amazon FSx file system. See Protocol below.
        """
        return pulumi.get(self, "protocol")

    @protocol.setter
    def protocol(self, value: pulumi.Input['LocationFsxOntapFileSystemProtocolArgs']):
        pulumi.set(self, "protocol", value)

    @property
    @pulumi.getter(name="securityGroupArns")
    def security_group_arns(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The security groups that provide access to your file system's preferred subnet. The security groups must allow outbbound traffic on the following ports (depending on the protocol you use):
        * Network File System (NFS): TCP ports 111, 635, and 2049
        * Server Message Block (SMB): TCP port 445
        """
        return pulumi.get(self, "security_group_arns")

    @security_group_arns.setter
    def security_group_arns(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "security_group_arns", value)

    @property
    @pulumi.getter(name="storageVirtualMachineArn")
    def storage_virtual_machine_arn(self) -> pulumi.Input[str]:
        """
        The ARN of the SVM in your file system where you want to copy data to of from.

        The following arguments are optional:
        """
        return pulumi.get(self, "storage_virtual_machine_arn")

    @storage_virtual_machine_arn.setter
    def storage_virtual_machine_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "storage_virtual_machine_arn", value)

    @property
    @pulumi.getter
    def subdirectory(self) -> Optional[pulumi.Input[str]]:
        """
        Path to the file share in the SVM where you'll copy your data. You can specify a junction path (also known as a mount point), qtree path (for NFS file shares), or share name (for SMB file shares) (e.g. `/vol1`, `/vol1/tree1`, `share1`).
        """
        return pulumi.get(self, "subdirectory")

    @subdirectory.setter
    def subdirectory(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subdirectory", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _LocationFsxOntapFileSystemState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 creation_time: Optional[pulumi.Input[str]] = None,
                 fsx_filesystem_arn: Optional[pulumi.Input[str]] = None,
                 protocol: Optional[pulumi.Input['LocationFsxOntapFileSystemProtocolArgs']] = None,
                 security_group_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 storage_virtual_machine_arn: Optional[pulumi.Input[str]] = None,
                 subdirectory: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 uri: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering LocationFsxOntapFileSystem resources.
        :param pulumi.Input[str] arn: ARN of the DataSync Location for the FSx Ontap File System.
        :param pulumi.Input[str] fsx_filesystem_arn: ARN of the FSx Ontap File System.
        :param pulumi.Input['LocationFsxOntapFileSystemProtocolArgs'] protocol: The data transfer protocol that DataSync uses to access your Amazon FSx file system. See Protocol below.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_arns: The security groups that provide access to your file system's preferred subnet. The security groups must allow outbbound traffic on the following ports (depending on the protocol you use):
               * Network File System (NFS): TCP ports 111, 635, and 2049
               * Server Message Block (SMB): TCP port 445
        :param pulumi.Input[str] storage_virtual_machine_arn: The ARN of the SVM in your file system where you want to copy data to of from.
               
               The following arguments are optional:
        :param pulumi.Input[str] subdirectory: Path to the file share in the SVM where you'll copy your data. You can specify a junction path (also known as a mount point), qtree path (for NFS file shares), or share name (for SMB file shares) (e.g. `/vol1`, `/vol1/tree1`, `share1`).
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] uri: URI of the FSx ONTAP file system location
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if creation_time is not None:
            pulumi.set(__self__, "creation_time", creation_time)
        if fsx_filesystem_arn is not None:
            pulumi.set(__self__, "fsx_filesystem_arn", fsx_filesystem_arn)
        if protocol is not None:
            pulumi.set(__self__, "protocol", protocol)
        if security_group_arns is not None:
            pulumi.set(__self__, "security_group_arns", security_group_arns)
        if storage_virtual_machine_arn is not None:
            pulumi.set(__self__, "storage_virtual_machine_arn", storage_virtual_machine_arn)
        if subdirectory is not None:
            pulumi.set(__self__, "subdirectory", subdirectory)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if uri is not None:
            pulumi.set(__self__, "uri", uri)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the DataSync Location for the FSx Ontap File System.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "creation_time")

    @creation_time.setter
    def creation_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "creation_time", value)

    @property
    @pulumi.getter(name="fsxFilesystemArn")
    def fsx_filesystem_arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the FSx Ontap File System.
        """
        return pulumi.get(self, "fsx_filesystem_arn")

    @fsx_filesystem_arn.setter
    def fsx_filesystem_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "fsx_filesystem_arn", value)

    @property
    @pulumi.getter
    def protocol(self) -> Optional[pulumi.Input['LocationFsxOntapFileSystemProtocolArgs']]:
        """
        The data transfer protocol that DataSync uses to access your Amazon FSx file system. See Protocol below.
        """
        return pulumi.get(self, "protocol")

    @protocol.setter
    def protocol(self, value: Optional[pulumi.Input['LocationFsxOntapFileSystemProtocolArgs']]):
        pulumi.set(self, "protocol", value)

    @property
    @pulumi.getter(name="securityGroupArns")
    def security_group_arns(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The security groups that provide access to your file system's preferred subnet. The security groups must allow outbbound traffic on the following ports (depending on the protocol you use):
        * Network File System (NFS): TCP ports 111, 635, and 2049
        * Server Message Block (SMB): TCP port 445
        """
        return pulumi.get(self, "security_group_arns")

    @security_group_arns.setter
    def security_group_arns(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "security_group_arns", value)

    @property
    @pulumi.getter(name="storageVirtualMachineArn")
    def storage_virtual_machine_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the SVM in your file system where you want to copy data to of from.

        The following arguments are optional:
        """
        return pulumi.get(self, "storage_virtual_machine_arn")

    @storage_virtual_machine_arn.setter
    def storage_virtual_machine_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_virtual_machine_arn", value)

    @property
    @pulumi.getter
    def subdirectory(self) -> Optional[pulumi.Input[str]]:
        """
        Path to the file share in the SVM where you'll copy your data. You can specify a junction path (also known as a mount point), qtree path (for NFS file shares), or share name (for SMB file shares) (e.g. `/vol1`, `/vol1/tree1`, `share1`).
        """
        return pulumi.get(self, "subdirectory")

    @subdirectory.setter
    def subdirectory(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subdirectory", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter
    def uri(self) -> Optional[pulumi.Input[str]]:
        """
        URI of the FSx ONTAP file system location
        """
        return pulumi.get(self, "uri")

    @uri.setter
    def uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uri", value)


class LocationFsxOntapFileSystem(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 protocol: Optional[pulumi.Input[pulumi.InputType['LocationFsxOntapFileSystemProtocolArgs']]] = None,
                 security_group_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 storage_virtual_machine_arn: Optional[pulumi.Input[str]] = None,
                 subdirectory: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Resource for managing an AWS DataSync Location FSx Ontap File System.

        ## Example Usage

        ## Import

        Using `pulumi import`, import `aws_datasync_location_fsx_ontap_file_system` using the `DataSync-ARN#FSx-ontap-svm-ARN`. For example:

        ```sh
        $ pulumi import aws:datasync/locationFsxOntapFileSystem:LocationFsxOntapFileSystem example arn:aws:datasync:us-west-2:123456789012:location/loc-12345678901234567#arn:aws:fsx:us-west-2:123456789012:storage-virtual-machine/svm-12345678abcdef123
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['LocationFsxOntapFileSystemProtocolArgs']] protocol: The data transfer protocol that DataSync uses to access your Amazon FSx file system. See Protocol below.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_arns: The security groups that provide access to your file system's preferred subnet. The security groups must allow outbbound traffic on the following ports (depending on the protocol you use):
               * Network File System (NFS): TCP ports 111, 635, and 2049
               * Server Message Block (SMB): TCP port 445
        :param pulumi.Input[str] storage_virtual_machine_arn: The ARN of the SVM in your file system where you want to copy data to of from.
               
               The following arguments are optional:
        :param pulumi.Input[str] subdirectory: Path to the file share in the SVM where you'll copy your data. You can specify a junction path (also known as a mount point), qtree path (for NFS file shares), or share name (for SMB file shares) (e.g. `/vol1`, `/vol1/tree1`, `share1`).
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LocationFsxOntapFileSystemArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS DataSync Location FSx Ontap File System.

        ## Example Usage

        ## Import

        Using `pulumi import`, import `aws_datasync_location_fsx_ontap_file_system` using the `DataSync-ARN#FSx-ontap-svm-ARN`. For example:

        ```sh
        $ pulumi import aws:datasync/locationFsxOntapFileSystem:LocationFsxOntapFileSystem example arn:aws:datasync:us-west-2:123456789012:location/loc-12345678901234567#arn:aws:fsx:us-west-2:123456789012:storage-virtual-machine/svm-12345678abcdef123
        ```

        :param str resource_name: The name of the resource.
        :param LocationFsxOntapFileSystemArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LocationFsxOntapFileSystemArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 protocol: Optional[pulumi.Input[pulumi.InputType['LocationFsxOntapFileSystemProtocolArgs']]] = None,
                 security_group_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 storage_virtual_machine_arn: Optional[pulumi.Input[str]] = None,
                 subdirectory: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LocationFsxOntapFileSystemArgs.__new__(LocationFsxOntapFileSystemArgs)

            if protocol is None and not opts.urn:
                raise TypeError("Missing required property 'protocol'")
            __props__.__dict__["protocol"] = protocol
            if security_group_arns is None and not opts.urn:
                raise TypeError("Missing required property 'security_group_arns'")
            __props__.__dict__["security_group_arns"] = security_group_arns
            if storage_virtual_machine_arn is None and not opts.urn:
                raise TypeError("Missing required property 'storage_virtual_machine_arn'")
            __props__.__dict__["storage_virtual_machine_arn"] = storage_virtual_machine_arn
            __props__.__dict__["subdirectory"] = subdirectory
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["creation_time"] = None
            __props__.__dict__["fsx_filesystem_arn"] = None
            __props__.__dict__["tags_all"] = None
            __props__.__dict__["uri"] = None
        super(LocationFsxOntapFileSystem, __self__).__init__(
            'aws:datasync/locationFsxOntapFileSystem:LocationFsxOntapFileSystem',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            creation_time: Optional[pulumi.Input[str]] = None,
            fsx_filesystem_arn: Optional[pulumi.Input[str]] = None,
            protocol: Optional[pulumi.Input[pulumi.InputType['LocationFsxOntapFileSystemProtocolArgs']]] = None,
            security_group_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            storage_virtual_machine_arn: Optional[pulumi.Input[str]] = None,
            subdirectory: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            uri: Optional[pulumi.Input[str]] = None) -> 'LocationFsxOntapFileSystem':
        """
        Get an existing LocationFsxOntapFileSystem resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: ARN of the DataSync Location for the FSx Ontap File System.
        :param pulumi.Input[str] fsx_filesystem_arn: ARN of the FSx Ontap File System.
        :param pulumi.Input[pulumi.InputType['LocationFsxOntapFileSystemProtocolArgs']] protocol: The data transfer protocol that DataSync uses to access your Amazon FSx file system. See Protocol below.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_arns: The security groups that provide access to your file system's preferred subnet. The security groups must allow outbbound traffic on the following ports (depending on the protocol you use):
               * Network File System (NFS): TCP ports 111, 635, and 2049
               * Server Message Block (SMB): TCP port 445
        :param pulumi.Input[str] storage_virtual_machine_arn: The ARN of the SVM in your file system where you want to copy data to of from.
               
               The following arguments are optional:
        :param pulumi.Input[str] subdirectory: Path to the file share in the SVM where you'll copy your data. You can specify a junction path (also known as a mount point), qtree path (for NFS file shares), or share name (for SMB file shares) (e.g. `/vol1`, `/vol1/tree1`, `share1`).
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] uri: URI of the FSx ONTAP file system location
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LocationFsxOntapFileSystemState.__new__(_LocationFsxOntapFileSystemState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["creation_time"] = creation_time
        __props__.__dict__["fsx_filesystem_arn"] = fsx_filesystem_arn
        __props__.__dict__["protocol"] = protocol
        __props__.__dict__["security_group_arns"] = security_group_arns
        __props__.__dict__["storage_virtual_machine_arn"] = storage_virtual_machine_arn
        __props__.__dict__["subdirectory"] = subdirectory
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["uri"] = uri
        return LocationFsxOntapFileSystem(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN of the DataSync Location for the FSx Ontap File System.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> pulumi.Output[str]:
        return pulumi.get(self, "creation_time")

    @property
    @pulumi.getter(name="fsxFilesystemArn")
    def fsx_filesystem_arn(self) -> pulumi.Output[str]:
        """
        ARN of the FSx Ontap File System.
        """
        return pulumi.get(self, "fsx_filesystem_arn")

    @property
    @pulumi.getter
    def protocol(self) -> pulumi.Output['outputs.LocationFsxOntapFileSystemProtocol']:
        """
        The data transfer protocol that DataSync uses to access your Amazon FSx file system. See Protocol below.
        """
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter(name="securityGroupArns")
    def security_group_arns(self) -> pulumi.Output[Sequence[str]]:
        """
        The security groups that provide access to your file system's preferred subnet. The security groups must allow outbbound traffic on the following ports (depending on the protocol you use):
        * Network File System (NFS): TCP ports 111, 635, and 2049
        * Server Message Block (SMB): TCP port 445
        """
        return pulumi.get(self, "security_group_arns")

    @property
    @pulumi.getter(name="storageVirtualMachineArn")
    def storage_virtual_machine_arn(self) -> pulumi.Output[str]:
        """
        The ARN of the SVM in your file system where you want to copy data to of from.

        The following arguments are optional:
        """
        return pulumi.get(self, "storage_virtual_machine_arn")

    @property
    @pulumi.getter
    def subdirectory(self) -> pulumi.Output[str]:
        """
        Path to the file share in the SVM where you'll copy your data. You can specify a junction path (also known as a mount point), qtree path (for NFS file shares), or share name (for SMB file shares) (e.g. `/vol1`, `/vol1/tree1`, `share1`).
        """
        return pulumi.get(self, "subdirectory")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter
    def uri(self) -> pulumi.Output[str]:
        """
        URI of the FSx ONTAP file system location
        """
        return pulumi.get(self, "uri")

