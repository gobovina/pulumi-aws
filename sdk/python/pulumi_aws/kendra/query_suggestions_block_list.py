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

__all__ = ['QuerySuggestionsBlockListArgs', 'QuerySuggestionsBlockList']

@pulumi.input_type
class QuerySuggestionsBlockListArgs:
    def __init__(__self__, *,
                 index_id: pulumi.Input[str],
                 role_arn: pulumi.Input[str],
                 source_s3_path: pulumi.Input['QuerySuggestionsBlockListSourceS3PathArgs'],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a QuerySuggestionsBlockList resource.
        :param pulumi.Input[str] index_id: Identifier of the index for a block list.
        :param pulumi.Input[str] role_arn: IAM (Identity and Access Management) role used to access the block list text file in S3.
        :param pulumi.Input['QuerySuggestionsBlockListSourceS3PathArgs'] source_s3_path: S3 path where your block list text file is located. See details below.
               
               The `source_s3_path` configuration block supports the following arguments:
        :param pulumi.Input[str] description: Description for a block list.
        :param pulumi.Input[str] name: Name for the block list.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "index_id", index_id)
        pulumi.set(__self__, "role_arn", role_arn)
        pulumi.set(__self__, "source_s3_path", source_s3_path)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="indexId")
    def index_id(self) -> pulumi.Input[str]:
        """
        Identifier of the index for a block list.
        """
        return pulumi.get(self, "index_id")

    @index_id.setter
    def index_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "index_id", value)

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> pulumi.Input[str]:
        """
        IAM (Identity and Access Management) role used to access the block list text file in S3.
        """
        return pulumi.get(self, "role_arn")

    @role_arn.setter
    def role_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "role_arn", value)

    @property
    @pulumi.getter(name="sourceS3Path")
    def source_s3_path(self) -> pulumi.Input['QuerySuggestionsBlockListSourceS3PathArgs']:
        """
        S3 path where your block list text file is located. See details below.

        The `source_s3_path` configuration block supports the following arguments:
        """
        return pulumi.get(self, "source_s3_path")

    @source_s3_path.setter
    def source_s3_path(self, value: pulumi.Input['QuerySuggestionsBlockListSourceS3PathArgs']):
        pulumi.set(self, "source_s3_path", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description for a block list.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name for the block list.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _QuerySuggestionsBlockListState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 index_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 query_suggestions_block_list_id: Optional[pulumi.Input[str]] = None,
                 role_arn: Optional[pulumi.Input[str]] = None,
                 source_s3_path: Optional[pulumi.Input['QuerySuggestionsBlockListSourceS3PathArgs']] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering QuerySuggestionsBlockList resources.
        :param pulumi.Input[str] arn: ARN of the block list.
        :param pulumi.Input[str] description: Description for a block list.
        :param pulumi.Input[str] index_id: Identifier of the index for a block list.
        :param pulumi.Input[str] name: Name for the block list.
        :param pulumi.Input[str] query_suggestions_block_list_id: Unique identifier of the block list.
        :param pulumi.Input[str] role_arn: IAM (Identity and Access Management) role used to access the block list text file in S3.
        :param pulumi.Input['QuerySuggestionsBlockListSourceS3PathArgs'] source_s3_path: S3 path where your block list text file is located. See details below.
               
               The `source_s3_path` configuration block supports the following arguments:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider's default_tags configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if index_id is not None:
            pulumi.set(__self__, "index_id", index_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if query_suggestions_block_list_id is not None:
            pulumi.set(__self__, "query_suggestions_block_list_id", query_suggestions_block_list_id)
        if role_arn is not None:
            pulumi.set(__self__, "role_arn", role_arn)
        if source_s3_path is not None:
            pulumi.set(__self__, "source_s3_path", source_s3_path)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the block list.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description for a block list.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="indexId")
    def index_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the index for a block list.
        """
        return pulumi.get(self, "index_id")

    @index_id.setter
    def index_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "index_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name for the block list.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="querySuggestionsBlockListId")
    def query_suggestions_block_list_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the block list.
        """
        return pulumi.get(self, "query_suggestions_block_list_id")

    @query_suggestions_block_list_id.setter
    def query_suggestions_block_list_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "query_suggestions_block_list_id", value)

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> Optional[pulumi.Input[str]]:
        """
        IAM (Identity and Access Management) role used to access the block list text file in S3.
        """
        return pulumi.get(self, "role_arn")

    @role_arn.setter
    def role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_arn", value)

    @property
    @pulumi.getter(name="sourceS3Path")
    def source_s3_path(self) -> Optional[pulumi.Input['QuerySuggestionsBlockListSourceS3PathArgs']]:
        """
        S3 path where your block list text file is located. See details below.

        The `source_s3_path` configuration block supports the following arguments:
        """
        return pulumi.get(self, "source_s3_path")

    @source_s3_path.setter
    def source_s3_path(self, value: Optional[pulumi.Input['QuerySuggestionsBlockListSourceS3PathArgs']]):
        pulumi.set(self, "source_s3_path", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider's default_tags configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class QuerySuggestionsBlockList(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 index_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 role_arn: Optional[pulumi.Input[str]] = None,
                 source_s3_path: Optional[pulumi.Input[pulumi.InputType['QuerySuggestionsBlockListSourceS3PathArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Use the `aws_kendra_index_block_list` resource to manage an AWS Kendra block list used for query suggestions for an index.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.kendra.QuerySuggestionsBlockList("example",
            index_id=example_aws_kendra_index["id"],
            name="Example",
            role_arn=example_aws_iam_role["arn"],
            source_s3_path=aws.kendra.QuerySuggestionsBlockListSourceS3PathArgs(
                bucket=example_aws_s3_bucket["id"],
                key="example/suggestions.txt",
            ),
            tags={
                "Name": "Example Kendra Index",
            })
        ```

        ## Import

        Using `pulumi import`, import the `aws_kendra_query_suggestions_block_list` resource using the unique identifiers of the block list and index separated by a slash (`/`). For example:

        ```sh
         $ pulumi import aws:kendra/querySuggestionsBlockList:QuerySuggestionsBlockList example blocklist-123456780/idx-8012925589
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description for a block list.
        :param pulumi.Input[str] index_id: Identifier of the index for a block list.
        :param pulumi.Input[str] name: Name for the block list.
        :param pulumi.Input[str] role_arn: IAM (Identity and Access Management) role used to access the block list text file in S3.
        :param pulumi.Input[pulumi.InputType['QuerySuggestionsBlockListSourceS3PathArgs']] source_s3_path: S3 path where your block list text file is located. See details below.
               
               The `source_s3_path` configuration block supports the following arguments:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: QuerySuggestionsBlockListArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use the `aws_kendra_index_block_list` resource to manage an AWS Kendra block list used for query suggestions for an index.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.kendra.QuerySuggestionsBlockList("example",
            index_id=example_aws_kendra_index["id"],
            name="Example",
            role_arn=example_aws_iam_role["arn"],
            source_s3_path=aws.kendra.QuerySuggestionsBlockListSourceS3PathArgs(
                bucket=example_aws_s3_bucket["id"],
                key="example/suggestions.txt",
            ),
            tags={
                "Name": "Example Kendra Index",
            })
        ```

        ## Import

        Using `pulumi import`, import the `aws_kendra_query_suggestions_block_list` resource using the unique identifiers of the block list and index separated by a slash (`/`). For example:

        ```sh
         $ pulumi import aws:kendra/querySuggestionsBlockList:QuerySuggestionsBlockList example blocklist-123456780/idx-8012925589
        ```

        :param str resource_name: The name of the resource.
        :param QuerySuggestionsBlockListArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(QuerySuggestionsBlockListArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 index_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 role_arn: Optional[pulumi.Input[str]] = None,
                 source_s3_path: Optional[pulumi.Input[pulumi.InputType['QuerySuggestionsBlockListSourceS3PathArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = QuerySuggestionsBlockListArgs.__new__(QuerySuggestionsBlockListArgs)

            __props__.__dict__["description"] = description
            if index_id is None and not opts.urn:
                raise TypeError("Missing required property 'index_id'")
            __props__.__dict__["index_id"] = index_id
            __props__.__dict__["name"] = name
            if role_arn is None and not opts.urn:
                raise TypeError("Missing required property 'role_arn'")
            __props__.__dict__["role_arn"] = role_arn
            if source_s3_path is None and not opts.urn:
                raise TypeError("Missing required property 'source_s3_path'")
            __props__.__dict__["source_s3_path"] = source_s3_path
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["query_suggestions_block_list_id"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["tags_all"] = None
        super(QuerySuggestionsBlockList, __self__).__init__(
            'aws:kendra/querySuggestionsBlockList:QuerySuggestionsBlockList',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            index_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            query_suggestions_block_list_id: Optional[pulumi.Input[str]] = None,
            role_arn: Optional[pulumi.Input[str]] = None,
            source_s3_path: Optional[pulumi.Input[pulumi.InputType['QuerySuggestionsBlockListSourceS3PathArgs']]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'QuerySuggestionsBlockList':
        """
        Get an existing QuerySuggestionsBlockList resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: ARN of the block list.
        :param pulumi.Input[str] description: Description for a block list.
        :param pulumi.Input[str] index_id: Identifier of the index for a block list.
        :param pulumi.Input[str] name: Name for the block list.
        :param pulumi.Input[str] query_suggestions_block_list_id: Unique identifier of the block list.
        :param pulumi.Input[str] role_arn: IAM (Identity and Access Management) role used to access the block list text file in S3.
        :param pulumi.Input[pulumi.InputType['QuerySuggestionsBlockListSourceS3PathArgs']] source_s3_path: S3 path where your block list text file is located. See details below.
               
               The `source_s3_path` configuration block supports the following arguments:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider's default_tags configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _QuerySuggestionsBlockListState.__new__(_QuerySuggestionsBlockListState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["description"] = description
        __props__.__dict__["index_id"] = index_id
        __props__.__dict__["name"] = name
        __props__.__dict__["query_suggestions_block_list_id"] = query_suggestions_block_list_id
        __props__.__dict__["role_arn"] = role_arn
        __props__.__dict__["source_s3_path"] = source_s3_path
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return QuerySuggestionsBlockList(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN of the block list.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description for a block list.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="indexId")
    def index_id(self) -> pulumi.Output[str]:
        """
        Identifier of the index for a block list.
        """
        return pulumi.get(self, "index_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name for the block list.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="querySuggestionsBlockListId")
    def query_suggestions_block_list_id(self) -> pulumi.Output[str]:
        """
        Unique identifier of the block list.
        """
        return pulumi.get(self, "query_suggestions_block_list_id")

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> pulumi.Output[str]:
        """
        IAM (Identity and Access Management) role used to access the block list text file in S3.
        """
        return pulumi.get(self, "role_arn")

    @property
    @pulumi.getter(name="sourceS3Path")
    def source_s3_path(self) -> pulumi.Output['outputs.QuerySuggestionsBlockListSourceS3Path']:
        """
        S3 path where your block list text file is located. See details below.

        The `source_s3_path` configuration block supports the following arguments:
        """
        return pulumi.get(self, "source_s3_path")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider's default_tags configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

