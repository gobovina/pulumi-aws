# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['FolderMembershipArgs', 'FolderMembership']

@pulumi.input_type
class FolderMembershipArgs:
    def __init__(__self__, *,
                 folder_id: pulumi.Input[str],
                 member_id: pulumi.Input[str],
                 member_type: pulumi.Input[str],
                 aws_account_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a FolderMembership resource.
        :param pulumi.Input[str] folder_id: Identifier for the folder.
        :param pulumi.Input[str] member_id: ID of the asset (the dashboard, analysis, or dataset).
        :param pulumi.Input[str] member_type: Type of the member. Valid values are `ANALYSIS`, `DASHBOARD`, and `DATASET`.
               
               The following arguments are optional:
        :param pulumi.Input[str] aws_account_id: AWS account ID.
        """
        pulumi.set(__self__, "folder_id", folder_id)
        pulumi.set(__self__, "member_id", member_id)
        pulumi.set(__self__, "member_type", member_type)
        if aws_account_id is not None:
            pulumi.set(__self__, "aws_account_id", aws_account_id)

    @property
    @pulumi.getter(name="folderId")
    def folder_id(self) -> pulumi.Input[str]:
        """
        Identifier for the folder.
        """
        return pulumi.get(self, "folder_id")

    @folder_id.setter
    def folder_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "folder_id", value)

    @property
    @pulumi.getter(name="memberId")
    def member_id(self) -> pulumi.Input[str]:
        """
        ID of the asset (the dashboard, analysis, or dataset).
        """
        return pulumi.get(self, "member_id")

    @member_id.setter
    def member_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "member_id", value)

    @property
    @pulumi.getter(name="memberType")
    def member_type(self) -> pulumi.Input[str]:
        """
        Type of the member. Valid values are `ANALYSIS`, `DASHBOARD`, and `DATASET`.

        The following arguments are optional:
        """
        return pulumi.get(self, "member_type")

    @member_type.setter
    def member_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "member_type", value)

    @property
    @pulumi.getter(name="awsAccountId")
    def aws_account_id(self) -> Optional[pulumi.Input[str]]:
        """
        AWS account ID.
        """
        return pulumi.get(self, "aws_account_id")

    @aws_account_id.setter
    def aws_account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aws_account_id", value)


@pulumi.input_type
class _FolderMembershipState:
    def __init__(__self__, *,
                 aws_account_id: Optional[pulumi.Input[str]] = None,
                 folder_id: Optional[pulumi.Input[str]] = None,
                 member_id: Optional[pulumi.Input[str]] = None,
                 member_type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering FolderMembership resources.
        :param pulumi.Input[str] aws_account_id: AWS account ID.
        :param pulumi.Input[str] folder_id: Identifier for the folder.
        :param pulumi.Input[str] member_id: ID of the asset (the dashboard, analysis, or dataset).
        :param pulumi.Input[str] member_type: Type of the member. Valid values are `ANALYSIS`, `DASHBOARD`, and `DATASET`.
               
               The following arguments are optional:
        """
        if aws_account_id is not None:
            pulumi.set(__self__, "aws_account_id", aws_account_id)
        if folder_id is not None:
            pulumi.set(__self__, "folder_id", folder_id)
        if member_id is not None:
            pulumi.set(__self__, "member_id", member_id)
        if member_type is not None:
            pulumi.set(__self__, "member_type", member_type)

    @property
    @pulumi.getter(name="awsAccountId")
    def aws_account_id(self) -> Optional[pulumi.Input[str]]:
        """
        AWS account ID.
        """
        return pulumi.get(self, "aws_account_id")

    @aws_account_id.setter
    def aws_account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aws_account_id", value)

    @property
    @pulumi.getter(name="folderId")
    def folder_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier for the folder.
        """
        return pulumi.get(self, "folder_id")

    @folder_id.setter
    def folder_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "folder_id", value)

    @property
    @pulumi.getter(name="memberId")
    def member_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the asset (the dashboard, analysis, or dataset).
        """
        return pulumi.get(self, "member_id")

    @member_id.setter
    def member_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "member_id", value)

    @property
    @pulumi.getter(name="memberType")
    def member_type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of the member. Valid values are `ANALYSIS`, `DASHBOARD`, and `DATASET`.

        The following arguments are optional:
        """
        return pulumi.get(self, "member_type")

    @member_type.setter
    def member_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "member_type", value)


class FolderMembership(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws_account_id: Optional[pulumi.Input[str]] = None,
                 folder_id: Optional[pulumi.Input[str]] = None,
                 member_id: Optional[pulumi.Input[str]] = None,
                 member_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for managing an AWS QuickSight Folder Membership.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.quicksight.FolderMembership("example",
            folder_id=aws_quicksight_folder["example"]["folder_id"],
            member_type="DATASET",
            member_id=aws_quicksight_data_set["example"]["data_set_id"])
        ```

        ## Import

        Using `pulumi import`, import QuickSight Folder Membership using the AWS account ID, folder ID, member type, and member ID separated by commas (`,`). For example:

        ```sh
         $ pulumi import aws:quicksight/folderMembership:FolderMembership example 123456789012,example-folder,DATASET,example-dataset
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] aws_account_id: AWS account ID.
        :param pulumi.Input[str] folder_id: Identifier for the folder.
        :param pulumi.Input[str] member_id: ID of the asset (the dashboard, analysis, or dataset).
        :param pulumi.Input[str] member_type: Type of the member. Valid values are `ANALYSIS`, `DASHBOARD`, and `DATASET`.
               
               The following arguments are optional:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FolderMembershipArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS QuickSight Folder Membership.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.quicksight.FolderMembership("example",
            folder_id=aws_quicksight_folder["example"]["folder_id"],
            member_type="DATASET",
            member_id=aws_quicksight_data_set["example"]["data_set_id"])
        ```

        ## Import

        Using `pulumi import`, import QuickSight Folder Membership using the AWS account ID, folder ID, member type, and member ID separated by commas (`,`). For example:

        ```sh
         $ pulumi import aws:quicksight/folderMembership:FolderMembership example 123456789012,example-folder,DATASET,example-dataset
        ```

        :param str resource_name: The name of the resource.
        :param FolderMembershipArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FolderMembershipArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws_account_id: Optional[pulumi.Input[str]] = None,
                 folder_id: Optional[pulumi.Input[str]] = None,
                 member_id: Optional[pulumi.Input[str]] = None,
                 member_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FolderMembershipArgs.__new__(FolderMembershipArgs)

            __props__.__dict__["aws_account_id"] = aws_account_id
            if folder_id is None and not opts.urn:
                raise TypeError("Missing required property 'folder_id'")
            __props__.__dict__["folder_id"] = folder_id
            if member_id is None and not opts.urn:
                raise TypeError("Missing required property 'member_id'")
            __props__.__dict__["member_id"] = member_id
            if member_type is None and not opts.urn:
                raise TypeError("Missing required property 'member_type'")
            __props__.__dict__["member_type"] = member_type
        super(FolderMembership, __self__).__init__(
            'aws:quicksight/folderMembership:FolderMembership',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aws_account_id: Optional[pulumi.Input[str]] = None,
            folder_id: Optional[pulumi.Input[str]] = None,
            member_id: Optional[pulumi.Input[str]] = None,
            member_type: Optional[pulumi.Input[str]] = None) -> 'FolderMembership':
        """
        Get an existing FolderMembership resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] aws_account_id: AWS account ID.
        :param pulumi.Input[str] folder_id: Identifier for the folder.
        :param pulumi.Input[str] member_id: ID of the asset (the dashboard, analysis, or dataset).
        :param pulumi.Input[str] member_type: Type of the member. Valid values are `ANALYSIS`, `DASHBOARD`, and `DATASET`.
               
               The following arguments are optional:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FolderMembershipState.__new__(_FolderMembershipState)

        __props__.__dict__["aws_account_id"] = aws_account_id
        __props__.__dict__["folder_id"] = folder_id
        __props__.__dict__["member_id"] = member_id
        __props__.__dict__["member_type"] = member_type
        return FolderMembership(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="awsAccountId")
    def aws_account_id(self) -> pulumi.Output[str]:
        """
        AWS account ID.
        """
        return pulumi.get(self, "aws_account_id")

    @property
    @pulumi.getter(name="folderId")
    def folder_id(self) -> pulumi.Output[str]:
        """
        Identifier for the folder.
        """
        return pulumi.get(self, "folder_id")

    @property
    @pulumi.getter(name="memberId")
    def member_id(self) -> pulumi.Output[str]:
        """
        ID of the asset (the dashboard, analysis, or dataset).
        """
        return pulumi.get(self, "member_id")

    @property
    @pulumi.getter(name="memberType")
    def member_type(self) -> pulumi.Output[str]:
        """
        Type of the member. Valid values are `ANALYSIS`, `DASHBOARD`, and `DATASET`.

        The following arguments are optional:
        """
        return pulumi.get(self, "member_type")

