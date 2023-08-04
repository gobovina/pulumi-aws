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

__all__ = ['ServerlessCollectionArgs', 'ServerlessCollection']

@pulumi.input_type
class ServerlessCollectionArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 timeouts: Optional[pulumi.Input['ServerlessCollectionTimeoutsArgs']] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ServerlessCollection resource.
        :param pulumi.Input[str] description: Description of the collection.
        :param pulumi.Input[str] name: Name of the collection.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the collection. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] type: Type of collection. One of `SEARCH` or `TIMESERIES`.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the collection.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the collection.

        The following arguments are optional:
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the collection. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['ServerlessCollectionTimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['ServerlessCollectionTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of collection. One of `SEARCH` or `TIMESERIES`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _ServerlessCollectionState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 collection_endpoint: Optional[pulumi.Input[str]] = None,
                 dashboard_endpoint: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 kms_key_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 timeouts: Optional[pulumi.Input['ServerlessCollectionTimeoutsArgs']] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ServerlessCollection resources.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the collection.
        :param pulumi.Input[str] collection_endpoint: Collection-specific endpoint used to submit index, search, and data upload requests to an OpenSearch Serverless collection.
        :param pulumi.Input[str] description: Description of the collection.
        :param pulumi.Input[str] kms_key_arn: The ARN of the Amazon Web Services KMS key used to encrypt the collection.
        :param pulumi.Input[str] name: Name of the collection.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the collection. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] type: Type of collection. One of `SEARCH` or `TIMESERIES`.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if collection_endpoint is not None:
            pulumi.set(__self__, "collection_endpoint", collection_endpoint)
        if dashboard_endpoint is not None:
            pulumi.set(__self__, "dashboard_endpoint", dashboard_endpoint)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if kms_key_arn is not None:
            pulumi.set(__self__, "kms_key_arn", kms_key_arn)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the collection.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="collectionEndpoint")
    def collection_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        Collection-specific endpoint used to submit index, search, and data upload requests to an OpenSearch Serverless collection.
        """
        return pulumi.get(self, "collection_endpoint")

    @collection_endpoint.setter
    def collection_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "collection_endpoint", value)

    @property
    @pulumi.getter(name="dashboardEndpoint")
    def dashboard_endpoint(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "dashboard_endpoint")

    @dashboard_endpoint.setter
    def dashboard_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dashboard_endpoint", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the collection.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="kmsKeyArn")
    def kms_key_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the Amazon Web Services KMS key used to encrypt the collection.
        """
        return pulumi.get(self, "kms_key_arn")

    @kms_key_arn.setter
    def kms_key_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key_arn", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the collection.

        The following arguments are optional:
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the collection. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['ServerlessCollectionTimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['ServerlessCollectionTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of collection. One of `SEARCH` or `TIMESERIES`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class ServerlessCollection(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 timeouts: Optional[pulumi.Input[pulumi.InputType['ServerlessCollectionTimeoutsArgs']]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for managing an AWS OpenSearch Serverless Collection.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example_serverless_security_policy = aws.opensearch.ServerlessSecurityPolicy("exampleServerlessSecurityPolicy",
            type="encryption",
            policy=json.dumps({
                "Rules": [{
                    "Resource": ["collection/example"],
                    "ResourceType": "collection",
                }],
                "AWSOwnedKey": True,
            }))
        example_serverless_collection = aws.opensearch.ServerlessCollection("exampleServerlessCollection", opts=pulumi.ResourceOptions(depends_on=[example_serverless_security_policy]))
        ```

        ## Import

        terraform import {

         to = aws_opensearchserverless_collection.example

         id = "example" } Using `pulumi import`, import OpenSearchServerless Collection using the `id`. For exampleconsole % pulumi import aws_opensearchserverless_collection.example example

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the collection.
        :param pulumi.Input[str] name: Name of the collection.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the collection. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] type: Type of collection. One of `SEARCH` or `TIMESERIES`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ServerlessCollectionArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS OpenSearch Serverless Collection.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example_serverless_security_policy = aws.opensearch.ServerlessSecurityPolicy("exampleServerlessSecurityPolicy",
            type="encryption",
            policy=json.dumps({
                "Rules": [{
                    "Resource": ["collection/example"],
                    "ResourceType": "collection",
                }],
                "AWSOwnedKey": True,
            }))
        example_serverless_collection = aws.opensearch.ServerlessCollection("exampleServerlessCollection", opts=pulumi.ResourceOptions(depends_on=[example_serverless_security_policy]))
        ```

        ## Import

        terraform import {

         to = aws_opensearchserverless_collection.example

         id = "example" } Using `pulumi import`, import OpenSearchServerless Collection using the `id`. For exampleconsole % pulumi import aws_opensearchserverless_collection.example example

        :param str resource_name: The name of the resource.
        :param ServerlessCollectionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServerlessCollectionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 timeouts: Optional[pulumi.Input[pulumi.InputType['ServerlessCollectionTimeoutsArgs']]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServerlessCollectionArgs.__new__(ServerlessCollectionArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["timeouts"] = timeouts
            __props__.__dict__["type"] = type
            __props__.__dict__["arn"] = None
            __props__.__dict__["collection_endpoint"] = None
            __props__.__dict__["dashboard_endpoint"] = None
            __props__.__dict__["kms_key_arn"] = None
            __props__.__dict__["tags_all"] = None
        super(ServerlessCollection, __self__).__init__(
            'aws:opensearch/serverlessCollection:ServerlessCollection',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            collection_endpoint: Optional[pulumi.Input[str]] = None,
            dashboard_endpoint: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            kms_key_arn: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            timeouts: Optional[pulumi.Input[pulumi.InputType['ServerlessCollectionTimeoutsArgs']]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'ServerlessCollection':
        """
        Get an existing ServerlessCollection resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the collection.
        :param pulumi.Input[str] collection_endpoint: Collection-specific endpoint used to submit index, search, and data upload requests to an OpenSearch Serverless collection.
        :param pulumi.Input[str] description: Description of the collection.
        :param pulumi.Input[str] kms_key_arn: The ARN of the Amazon Web Services KMS key used to encrypt the collection.
        :param pulumi.Input[str] name: Name of the collection.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the collection. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] type: Type of collection. One of `SEARCH` or `TIMESERIES`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServerlessCollectionState.__new__(_ServerlessCollectionState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["collection_endpoint"] = collection_endpoint
        __props__.__dict__["dashboard_endpoint"] = dashboard_endpoint
        __props__.__dict__["description"] = description
        __props__.__dict__["kms_key_arn"] = kms_key_arn
        __props__.__dict__["name"] = name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["timeouts"] = timeouts
        __props__.__dict__["type"] = type
        return ServerlessCollection(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the collection.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="collectionEndpoint")
    def collection_endpoint(self) -> pulumi.Output[str]:
        """
        Collection-specific endpoint used to submit index, search, and data upload requests to an OpenSearch Serverless collection.
        """
        return pulumi.get(self, "collection_endpoint")

    @property
    @pulumi.getter(name="dashboardEndpoint")
    def dashboard_endpoint(self) -> pulumi.Output[str]:
        return pulumi.get(self, "dashboard_endpoint")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the collection.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="kmsKeyArn")
    def kms_key_arn(self) -> pulumi.Output[str]:
        """
        The ARN of the Amazon Web Services KMS key used to encrypt the collection.
        """
        return pulumi.get(self, "kms_key_arn")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the collection.

        The following arguments are optional:
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the collection. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter
    def timeouts(self) -> pulumi.Output[Optional['outputs.ServerlessCollectionTimeouts']]:
        return pulumi.get(self, "timeouts")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Type of collection. One of `SEARCH` or `TIMESERIES`.
        """
        return pulumi.get(self, "type")

