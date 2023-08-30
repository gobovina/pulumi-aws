# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['LocationFsxWindowsArgs', 'LocationFsxWindows']

@pulumi.input_type
class LocationFsxWindowsArgs:
    def __init__(__self__, *,
                 fsx_filesystem_arn: pulumi.Input[str],
                 password: pulumi.Input[str],
                 security_group_arns: pulumi.Input[Sequence[pulumi.Input[str]]],
                 user: pulumi.Input[str],
                 domain: Optional[pulumi.Input[str]] = None,
                 subdirectory: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a LocationFsxWindows resource.
        :param pulumi.Input[str] fsx_filesystem_arn: The Amazon Resource Name (ARN) for the FSx for Windows file system.
        :param pulumi.Input[str] password: The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_arns: The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
        :param pulumi.Input[str] user: The user who has the permissions to access files and folders in the FSx for Windows file system.
        :param pulumi.Input[str] domain: The name of the Windows domain that the FSx for Windows server belongs to.
        :param pulumi.Input[str] subdirectory: Subdirectory to perform actions as source or destination.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "fsx_filesystem_arn", fsx_filesystem_arn)
        pulumi.set(__self__, "password", password)
        pulumi.set(__self__, "security_group_arns", security_group_arns)
        pulumi.set(__self__, "user", user)
        if domain is not None:
            pulumi.set(__self__, "domain", domain)
        if subdirectory is not None:
            pulumi.set(__self__, "subdirectory", subdirectory)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="fsxFilesystemArn")
    def fsx_filesystem_arn(self) -> pulumi.Input[str]:
        """
        The Amazon Resource Name (ARN) for the FSx for Windows file system.
        """
        return pulumi.get(self, "fsx_filesystem_arn")

    @fsx_filesystem_arn.setter
    def fsx_filesystem_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "fsx_filesystem_arn", value)

    @property
    @pulumi.getter
    def password(self) -> pulumi.Input[str]:
        """
        The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: pulumi.Input[str]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter(name="securityGroupArns")
    def security_group_arns(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
        """
        return pulumi.get(self, "security_group_arns")

    @security_group_arns.setter
    def security_group_arns(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "security_group_arns", value)

    @property
    @pulumi.getter
    def user(self) -> pulumi.Input[str]:
        """
        The user who has the permissions to access files and folders in the FSx for Windows file system.
        """
        return pulumi.get(self, "user")

    @user.setter
    def user(self, value: pulumi.Input[str]):
        pulumi.set(self, "user", value)

    @property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Windows domain that the FSx for Windows server belongs to.
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def subdirectory(self) -> Optional[pulumi.Input[str]]:
        """
        Subdirectory to perform actions as source or destination.
        """
        return pulumi.get(self, "subdirectory")

    @subdirectory.setter
    def subdirectory(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subdirectory", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _LocationFsxWindowsState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 creation_time: Optional[pulumi.Input[str]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 fsx_filesystem_arn: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 security_group_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subdirectory: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 uri: Optional[pulumi.Input[str]] = None,
                 user: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering LocationFsxWindows resources.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the DataSync Location.
        :param pulumi.Input[str] creation_time: The time that the FSx for Windows location was created.
        :param pulumi.Input[str] domain: The name of the Windows domain that the FSx for Windows server belongs to.
        :param pulumi.Input[str] fsx_filesystem_arn: The Amazon Resource Name (ARN) for the FSx for Windows file system.
        :param pulumi.Input[str] password: The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_arns: The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
        :param pulumi.Input[str] subdirectory: Subdirectory to perform actions as source or destination.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] uri: The URL of the FSx for Windows location that was described.
        :param pulumi.Input[str] user: The user who has the permissions to access files and folders in the FSx for Windows file system.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if creation_time is not None:
            pulumi.set(__self__, "creation_time", creation_time)
        if domain is not None:
            pulumi.set(__self__, "domain", domain)
        if fsx_filesystem_arn is not None:
            pulumi.set(__self__, "fsx_filesystem_arn", fsx_filesystem_arn)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if security_group_arns is not None:
            pulumi.set(__self__, "security_group_arns", security_group_arns)
        if subdirectory is not None:
            pulumi.set(__self__, "subdirectory", subdirectory)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if uri is not None:
            pulumi.set(__self__, "uri", uri)
        if user is not None:
            pulumi.set(__self__, "user", user)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the DataSync Location.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> Optional[pulumi.Input[str]]:
        """
        The time that the FSx for Windows location was created.
        """
        return pulumi.get(self, "creation_time")

    @creation_time.setter
    def creation_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "creation_time", value)

    @property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Windows domain that the FSx for Windows server belongs to.
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter(name="fsxFilesystemArn")
    def fsx_filesystem_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) for the FSx for Windows file system.
        """
        return pulumi.get(self, "fsx_filesystem_arn")

    @fsx_filesystem_arn.setter
    def fsx_filesystem_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "fsx_filesystem_arn", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter(name="securityGroupArns")
    def security_group_arns(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
        """
        return pulumi.get(self, "security_group_arns")

    @security_group_arns.setter
    def security_group_arns(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "security_group_arns", value)

    @property
    @pulumi.getter
    def subdirectory(self) -> Optional[pulumi.Input[str]]:
        """
        Subdirectory to perform actions as source or destination.
        """
        return pulumi.get(self, "subdirectory")

    @subdirectory.setter
    def subdirectory(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subdirectory", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter
    def uri(self) -> Optional[pulumi.Input[str]]:
        """
        The URL of the FSx for Windows location that was described.
        """
        return pulumi.get(self, "uri")

    @uri.setter
    def uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uri", value)

    @property
    @pulumi.getter
    def user(self) -> Optional[pulumi.Input[str]]:
        """
        The user who has the permissions to access files and folders in the FSx for Windows file system.
        """
        return pulumi.get(self, "user")

    @user.setter
    def user(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user", value)


class LocationFsxWindows(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 fsx_filesystem_arn: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 security_group_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subdirectory: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 user: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an AWS DataSync FSx Windows Location.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.datasync.LocationFsxWindows("example",
            fsx_filesystem_arn=aws_fsx_windows_file_system["example"]["arn"],
            user="SomeUser",
            password="SuperSecretPassw0rd",
            security_group_arns=[aws_security_group["example"]["arn"]])
        ```

        ## Import

        Using `pulumi import`, import `aws_datasync_location_fsx_windows_file_system` using the `DataSync-ARN#FSx-Windows-ARN`. For example:

        ```sh
         $ pulumi import aws:datasync/locationFsxWindows:LocationFsxWindows example arn:aws:datasync:us-west-2:123456789012:location/loc-12345678901234567#arn:aws:fsx:us-west-2:476956259333:file-system/fs-08e04cd442c1bb94a
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain: The name of the Windows domain that the FSx for Windows server belongs to.
        :param pulumi.Input[str] fsx_filesystem_arn: The Amazon Resource Name (ARN) for the FSx for Windows file system.
        :param pulumi.Input[str] password: The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_arns: The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
        :param pulumi.Input[str] subdirectory: Subdirectory to perform actions as source or destination.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] user: The user who has the permissions to access files and folders in the FSx for Windows file system.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LocationFsxWindowsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an AWS DataSync FSx Windows Location.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.datasync.LocationFsxWindows("example",
            fsx_filesystem_arn=aws_fsx_windows_file_system["example"]["arn"],
            user="SomeUser",
            password="SuperSecretPassw0rd",
            security_group_arns=[aws_security_group["example"]["arn"]])
        ```

        ## Import

        Using `pulumi import`, import `aws_datasync_location_fsx_windows_file_system` using the `DataSync-ARN#FSx-Windows-ARN`. For example:

        ```sh
         $ pulumi import aws:datasync/locationFsxWindows:LocationFsxWindows example arn:aws:datasync:us-west-2:123456789012:location/loc-12345678901234567#arn:aws:fsx:us-west-2:476956259333:file-system/fs-08e04cd442c1bb94a
        ```

        :param str resource_name: The name of the resource.
        :param LocationFsxWindowsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LocationFsxWindowsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 fsx_filesystem_arn: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 security_group_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subdirectory: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 user: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LocationFsxWindowsArgs.__new__(LocationFsxWindowsArgs)

            __props__.__dict__["domain"] = domain
            if fsx_filesystem_arn is None and not opts.urn:
                raise TypeError("Missing required property 'fsx_filesystem_arn'")
            __props__.__dict__["fsx_filesystem_arn"] = fsx_filesystem_arn
            if password is None and not opts.urn:
                raise TypeError("Missing required property 'password'")
            __props__.__dict__["password"] = None if password is None else pulumi.Output.secret(password)
            if security_group_arns is None and not opts.urn:
                raise TypeError("Missing required property 'security_group_arns'")
            __props__.__dict__["security_group_arns"] = security_group_arns
            __props__.__dict__["subdirectory"] = subdirectory
            __props__.__dict__["tags"] = tags
            if user is None and not opts.urn:
                raise TypeError("Missing required property 'user'")
            __props__.__dict__["user"] = user
            __props__.__dict__["arn"] = None
            __props__.__dict__["creation_time"] = None
            __props__.__dict__["tags_all"] = None
            __props__.__dict__["uri"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["password"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(LocationFsxWindows, __self__).__init__(
            'aws:datasync/locationFsxWindows:LocationFsxWindows',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            creation_time: Optional[pulumi.Input[str]] = None,
            domain: Optional[pulumi.Input[str]] = None,
            fsx_filesystem_arn: Optional[pulumi.Input[str]] = None,
            password: Optional[pulumi.Input[str]] = None,
            security_group_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            subdirectory: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            uri: Optional[pulumi.Input[str]] = None,
            user: Optional[pulumi.Input[str]] = None) -> 'LocationFsxWindows':
        """
        Get an existing LocationFsxWindows resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the DataSync Location.
        :param pulumi.Input[str] creation_time: The time that the FSx for Windows location was created.
        :param pulumi.Input[str] domain: The name of the Windows domain that the FSx for Windows server belongs to.
        :param pulumi.Input[str] fsx_filesystem_arn: The Amazon Resource Name (ARN) for the FSx for Windows file system.
        :param pulumi.Input[str] password: The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_arns: The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
        :param pulumi.Input[str] subdirectory: Subdirectory to perform actions as source or destination.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] uri: The URL of the FSx for Windows location that was described.
        :param pulumi.Input[str] user: The user who has the permissions to access files and folders in the FSx for Windows file system.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LocationFsxWindowsState.__new__(_LocationFsxWindowsState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["creation_time"] = creation_time
        __props__.__dict__["domain"] = domain
        __props__.__dict__["fsx_filesystem_arn"] = fsx_filesystem_arn
        __props__.__dict__["password"] = password
        __props__.__dict__["security_group_arns"] = security_group_arns
        __props__.__dict__["subdirectory"] = subdirectory
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["uri"] = uri
        __props__.__dict__["user"] = user
        return LocationFsxWindows(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the DataSync Location.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> pulumi.Output[str]:
        """
        The time that the FSx for Windows location was created.
        """
        return pulumi.get(self, "creation_time")

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the Windows domain that the FSx for Windows server belongs to.
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter(name="fsxFilesystemArn")
    def fsx_filesystem_arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) for the FSx for Windows file system.
        """
        return pulumi.get(self, "fsx_filesystem_arn")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[str]:
        """
        The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter(name="securityGroupArns")
    def security_group_arns(self) -> pulumi.Output[Sequence[str]]:
        """
        The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
        """
        return pulumi.get(self, "security_group_arns")

    @property
    @pulumi.getter
    def subdirectory(self) -> pulumi.Output[str]:
        """
        Subdirectory to perform actions as source or destination.
        """
        return pulumi.get(self, "subdirectory")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter
    def uri(self) -> pulumi.Output[str]:
        """
        The URL of the FSx for Windows location that was described.
        """
        return pulumi.get(self, "uri")

    @property
    @pulumi.getter
    def user(self) -> pulumi.Output[str]:
        """
        The user who has the permissions to access files and folders in the FSx for Windows file system.
        """
        return pulumi.get(self, "user")

